package org.crazyit.app.domain;

import java.util.*;

import javax.persistence.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2018, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@Entity
@Table(name="person_inf")
public class Person
{
	// ��ʶ����
	@Id @Column(name="person_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private int age;
	// �����Personʵ�������Addressʵ��
	@ManyToOne(targetEntity=Address.class)
	// ��ʽʹ��@JoinTableӳ�����ӱ�
	@JoinTable(name="person_address", // ָ�����ӱ��ı���Ϊperson_address
		// ָ�����ӱ���person_id����У����յ���ǰʵ���Ӧ����������
		joinColumns=@JoinColumn(name="person_id"
			, referencedColumnName="person_id", unique=true),
		// ָ�����ӱ���address_id����У����յ���ǰʵ��Ĺ���ʵ���Ӧ����������
		inverseJoinColumns=@JoinColumn(name="address_id"
			, referencedColumnName="address_id")
	)
	private Address address;

	// id��setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// age��setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	// address��setter��getter����
	public void setAddress(Address address)
	{
		this.address = address;
	}
	public Address getAddress()
	{
		return this.address;
	}
}