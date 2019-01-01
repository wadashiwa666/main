package com.vo;

import java.io.Serializable;

/**
 * 要想使用redis存对象，一定要让实体类实现Serializable接口，否则会报错。
 * @author Administrator
 *
 */
public class Transfer implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}