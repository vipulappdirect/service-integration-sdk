package com.appdirect.sdk.appmarket.api;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@Builder
public class EventPayload {
	private UserInfo user;
	private CompanyInfo company;
	private AccountInfo account;
	private AddonInstanceInfo addonInstance;
	private AddonBindingInfo addonBinding;
	private OrderInfo order;
	private NoticeInfo notice;
	private Map<String, String> configuration = new HashMap<>();
}