package com.runnershigh.member.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private int id;

	@Column(name = "nickname", length = 30, nullable = false)
	private String nickName;
	@Column(name = "password", length = 15, nullable = false)
	private String password;
	@Column(name = "birthday", nullable = false)
	private Date birthDay;
	@Column(name = "profile")
	private String profile;

}
