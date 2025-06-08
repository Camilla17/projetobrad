package com.example.projectbrad.domain.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account_style_caption")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountStyleCaption {
	@Id
	@UuidGenerator
	private UUID id;

	@Column(name = "account_style_link", nullable = false, unique = true, length = 255)
	private String accountStyleLink;

	@Column(name = "account_style_caption", nullable = false, length = 255)
	private String accountStyleCaption;

	@Column(name = "account_subtype")
	private String accountSubtype;

	@Column(name = "account_number")
	private String accountNumber;

	@Column(name = "account_reference")
	private String accountReference;

	@Column(name = "account_supplier")
	private String accountSupplier;

	@Column(name = "account_reader")
	private String accountReader;

	@Column(name = "record_start")
	private OffsetDateTime recordStart;

	@Column(name = "record_end")
	private OffsetDateTime recordEnd;

	@Column(name = "record_data_quality")
	private String recordDataQuality;

	@Column(name = "record_billing_type")
	private String recordBillingType;

	@Column(name = "record_subtype")
	private String recordSubtype;

	@Column(name = "record_entry_method")
	private String recordEntryMethod;

	@Column(name = "record_reference")
	private String recordReference;

	@Column(name = "record_invoice_number")
	private String recordInvoiceNumber;

	@Column(name = "account_style_field_1")
	private String accountStyleField1;
	
	@Column(name = "account_style_field_2")
	private String accountStyleField2;
	@Column(name = "account_style_field_3")
	private String accountStyleField3;
	@Column(name = "account_style_field_4")
	private String accountStyleField4;
	@Column(name = "account_style_field_5")
	private String accountStyleField5;
	@Column(name = "account_style_field_6")
	private String accountStyleField6;
	@Column(name = "account_style_field_7")
	private String accountStyleField7;
	@Column(name = "account_style_field_8")
	private String accountStyleField8;
	@Column(name = "account_style_field_9")
	private String accountStyleField9;
	@Column(name = "account_style_field_10")
	private String accountStyleField10;
	@Column(name = "account_style_field_11")
	private String accountStyleField11;
	@Column(name = "account_style_field_12")
	private String accountStyleField12;
	@Column(name = "account_style_field_13")
	private String accountStyleField13;
	@Column(name = "account_style_field_14")
	private String accountStyleField14;
	@Column(name = "account_style_field_15")
	private String accountStyleField15;
	@Column(name = "account_style_field_16")
	private String accountStyleField16;
	@Column(name = "account_style_field_17")
	private String accountStyleField17;
	@Column(name = "account_style_field_18")
	private String accountStyleField18;
	@Column(name = "account_style_field_19")
	private String accountStyleField19;
	@Column(name = "account_style_field_20")
	private String accountStyleField20;
	@Column(name = "account_style_field_21")
	private String accountStyleField21;
	@Column(name = "account_style_field_22")
	private String accountStyleField22;
	@Column(name = "account_style_field_23")
	private String accountStyleField23;
	@Column(name = "account_style_field_24")
	private String accountStyleField24;
	@Column(name = "account_style_field_25")
	private String accountStyleField25;
	@Column(name = "account_style_field_26")
	private String accountStyleField26;
	@Column(name = "account_style_field_27")
	private String accountStyleField27;
	@Column(name = "account_style_field_28")
	private String accountStyleField28;
	@Column(name = "account_style_field_29")
	private String accountStyleField29;
	@Column(name = "account_style_field_30")
	private String accountStyleField30;
	@Column(name = "account_style_field_31")
	private String accountStyleField31;
	@Column(name = "account_style_field_32")
	private String accountStyleField32;
	@Column(name = "account_style_field_33")
	private String accountStyleField33;
	@Column(name = "account_style_field_34")
	private String accountStyleField34;
	@Column(name = "account_style_field_35")
	private String accountStyleField35;
	@Column(name = "account_style_field_36")
	private String accountStyleField36;
	@Column(name = "account_style_field_37")
	private String accountStyleField37;
	@Column(name = "account_style_field_38")
	private String accountStyleField38;
	@Column(name = "account_style_field_39")
	private String accountStyleField39;
	@Column(name = "account_style_field_40")
	private String accountStyleField40;
}
