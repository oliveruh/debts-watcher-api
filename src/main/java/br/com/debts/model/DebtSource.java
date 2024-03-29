package br.com.debts.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "debt_source")
public class DebtSource implements Serializable {

    @Id
	@Column(name = "id")
    private Long id;

    @Column(name = "logo_url")
    private String logoURL;

    private String name;

    private String description;

    @Column(name = "date_added")
    private Date dateAdded;

    @Column(name = "is_credit_card")
    private Boolean isCreditCard;

    @Column(name = "credit_card_limit")
    private Long creditCardLimit;

    @Column(name = "due_day")
    private Long dueDay;

}
