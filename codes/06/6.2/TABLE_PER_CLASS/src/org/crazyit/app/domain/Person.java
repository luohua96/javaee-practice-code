package org.crazyit.app.domain;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
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
// ָ��ʹ��ÿ���������Ӧһ�ű���ӳ�����
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="person_inf")
public class Person
{
	// ��ʶ����
	@Id @Column(name="person_id")
	// ��������������
	@TableGenerator(name="personGen" , table="PERSON_ID_GEN",
		pkColumnName="gen_key", valueColumnName="gen_value",
		pkColumnValue="person_id")
	// ���ڲ���ʹ��identity�������ɲ��ԣ��ʴ˴�ʹ��GenerationType.TABLE����
	@GeneratedValue(strategy=GenerationType.TABLE
		, generator="personGen")
	private Integer id;
	private String name;
	private char gender;
	// �����Personʵ���������ԣ�address
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="detail",
		column=@Column(name="address_detail")),
		@AttributeOverride(name="zip",
		column=@Column(name="address_zip")),
		@AttributeOverride(name="country",
		column=@Column(name="address_country"))
	})
	private Address address;
	// �޲����Ĺ�����
	public Person(){}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Person(Integer id , String name , char gender)
	{
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

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

	// gender��setter��getter����
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public char getGender()
	{
		return this.gender;
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