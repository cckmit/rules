/*
 * This class was generated by the JDS command line tool.
 *
 * It was created by the user SBSS_70962460707363720404167877752465397693708628039895110251133325240
 * on the HANA system mo-70f279fea.mo.sap.corp:30015
 * for CDS entities contained inside the schema HNR2ZDOEHEYYQMO8_CONNECTED_GOODS_HDI_CONTAINER.
 *
 * Time of creation: 2017/02/10 19:26:32
 *
 */
package com.sap.iot.ain.rules.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Transient;

@Entity
@Table(name = "\"sap.ain.metaData::Rules.RuleStep\"")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleStepOld implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "\"Client\"", nullable = true, length = 32)
    private String client;

    @Id
    @Column(name = "\"ID\"", nullable = false, length = 200)
    private String id;

    @Column(name = "\"RuleID\"", length = 200)
    private String ruleID;

    @Column(name = "\"SequenceNo\"")
    private int sequenceNo;

    @Column(name = "\"IsStepOperator\"")
    private int isStepOperator;

    @Column(name = "\"Field1\"", length = 200)
    private String field1;

    @Column(name = "\"Field1Type\"", length = 200)
    private String field1Type;

    @Column(name = "\"Field1TemplateType\"", length = 10)
    private String field1TemplateType;

    @Column(name = "\"Operator\"", length = 200)
    private String operator;

    @Column(name = "\"Field2\"", length = 200)
    private String field2;

    @Column(name = "\"Field2Type\"", length = 200)
    private String field2Type;
    
    @Column(name = "\"Field2TemplateType\"", length = 10)
    private String field2TemplateType;

    @Column(name = "\"Level\"")
    private int level;

    @Column(name = "\"Field1Ext\"")
    private String field1Ext;

    @Column(name = "\"Field1PST\"")
    private String field1PST;

    @Column(name = "\"Field2Ext\"")
    private String field2Ext;

    @Column(name = "\"Field2PST\"")
    private String field2PST;

    @Column(name = "\"DataType\"")
    private String dataType;

    @Column(name = "\"Field1IsIndicator\"")
    private String field1IsIndicator;

    @Column(name = "\"Field2IsIndicator\"")
    private String field2IsIndicator;

    @Column(name = "\"Field1Template\"")
    private String field1Template;

    @Column(name = "\"Field2Template\"")
    private String field2Template;

    @Transient
    private boolean executionStatus;

    public RuleStepOld() {
    }

    public RuleStepOld(String id) {
        this.id = id;
    }

    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

    public String getRuleID() {
        return ruleID;
    }

    public void setSequenceNo(int sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public int getSequenceNo() {
        return sequenceNo;
    }

    public void setIsStepOperator(int isStepOperator) {
        this.isStepOperator = isStepOperator;
    }

    public int getIsStepOperator() {
        return isStepOperator;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField1() {
        return field1;
    }

    public void setField1Type(String field1Type) {
        this.field1Type = field1Type;
    }

    public String getField1Type() {
        return field1Type;
    }

    public void setField1TemplateType(String field1TemplateType) {
        this.field1TemplateType = field1TemplateType;
    }

    public String getField1TemplateType() {
        return field1TemplateType;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField2() {
        return field2;
    }

    public void setField2Type(String field2Type) {
        this.field2Type = field2Type;
    }

    public String getField2Type() {
        return field2Type;
    }
    
    public void setField2TemplateType(String field2TemplateType) {
        this.field2TemplateType = field2TemplateType;
    }

    public String getField2TemplateType() {
        return field2TemplateType;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getField1Ext() {
        return field1Ext;
    }

    public void setField1Ext(String field1Ext) {
        this.field1Ext = field1Ext;
    }

    public String getField1PST() {
        return field1PST;
    }

    public void setField1PST(String field1PST) {
        this.field1PST = field1PST;
    }

    public String getField2Ext() {
        return field2Ext;
    }

    public void setField2Ext(String field2Ext) {
        this.field2Ext = field2Ext;
    }

    public String getField2PST() {
        return field2PST;
    }

    public void setField2PST(String field2PST) {
        this.field2PST = field2PST;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getField1IsIndicator() {
        return field1IsIndicator;
    }

    public void setField1IsIndicator(String field1IsIndicator) {
        this.field1IsIndicator = field1IsIndicator;
    }

    public String getField2IsIndicator() {
        return field2IsIndicator;
    }

    public void setField2IsIndicator(String field2IsIndicator) {
        this.field2IsIndicator = field2IsIndicator;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getField1Template() {
        return field1Template;
    }

    public void setField1Template(String field1Template) {
        this.field1Template = field1Template;
    }

    public String getField2Template() {
        return field2Template;
    }

    public void setField2Template(String field2Template) {
        this.field2Template = field2Template;
    }

    public boolean getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(boolean executionStatus) {
        this.executionStatus = executionStatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.client);
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.ruleID);
        hash = 23 * hash + this.sequenceNo;
        hash = 23 * hash + this.isStepOperator;
        hash = 23 * hash + Objects.hashCode(this.field1);
        hash = 23 * hash + Objects.hashCode(this.field1Type);
        hash = 23 * hash + Objects.hashCode(this.field1TemplateType);
        hash = 23 * hash + Objects.hashCode(this.operator);
        hash = 23 * hash + Objects.hashCode(this.field2);
        hash = 23 * hash + Objects.hashCode(this.field2Type);
        hash = 23 * hash + Objects.hashCode(this.field2TemplateType);
        hash = 23 * hash + this.level;
        hash = 23 * hash + Objects.hashCode(this.field1Ext);
        hash = 23 * hash + Objects.hashCode(this.field1PST);
        hash = 23 * hash + Objects.hashCode(this.field2Ext);
        hash = 23 * hash + Objects.hashCode(this.field2PST);
        hash = 23 * hash + Objects.hashCode(this.dataType);
        hash = 23 * hash + Objects.hashCode(this.field1IsIndicator);
        hash = 23 * hash + Objects.hashCode(this.field2IsIndicator);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RuleStepOld other = (RuleStepOld) obj;
        if (this.sequenceNo != other.sequenceNo) {
            return false;
        }
        if (this.isStepOperator != other.isStepOperator) {
            return false;
        }
        if (this.level != other.level) {
            return false;
        }
        if (!Objects.equals(this.client, other.client)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.ruleID, other.ruleID)) {
            return false;
        }
        if (!Objects.equals(this.field1, other.field1)) {
            return false;
        }
        if (!Objects.equals(this.field1Type, other.field1Type)) {
            return false;
        }
        if (!Objects.equals(this.field1TemplateType, other.field1TemplateType)) {
            return false;
        }
        if (!Objects.equals(this.operator, other.operator)) {
            return false;
        }
        if (!Objects.equals(this.field2, other.field2)) {
            return false;
        }
        if (!Objects.equals(this.field2Type, other.field2Type)) {
            return false;
        }
        if (!Objects.equals(this.field2TemplateType, other.field2TemplateType)) {
            return false;
        }
        if (!Objects.equals(this.field1Ext, other.field1Ext)) {
            return false;
        }
        if (!Objects.equals(this.field1PST, other.field1PST)) {
            return false;
        }
        if (!Objects.equals(this.field2Ext, other.field2Ext)) {
            return false;
        }
        if (!Objects.equals(this.field2PST, other.field2PST)) {
            return false;
        }
        if (!Objects.equals(this.dataType, other.dataType)) {
            return false;
        }
        if (!Objects.equals(this.field1IsIndicator, other.field1IsIndicator)) {
            return false;
        }
        if (!Objects.equals(this.field2IsIndicator, other.field2IsIndicator)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RuleStep{" + "client=" + client + ", id=" + id + ", ruleID=" + ruleID + ", sequenceNo=" + sequenceNo + ", isStepOperator=" + isStepOperator + ", field1=" + field1 + ", field1Type=" + field1Type + ", field1TemplateType=" + field1TemplateType + ", operator=" + operator + ", field2=" + field2 + ", field2Type=" + field2Type + ", field2TemplateType=" + field2TemplateType + ", level=" + level + ", field1Ext=" + field1Ext + ", field1PST=" + field1PST + ", field2Ext=" + field2Ext + ", field2PST=" + field2PST + ", dataType=" + dataType + ", field1IsIndicator=" + field1IsIndicator + ", field2IsIndicator=" + field2IsIndicator + '}';
    }

}
