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
import com.google.common.collect.Range;
import javax.persistence.Transient;

@Entity
@Table(name = "\"sap.ain.metaData::Rules.RuleStep\"")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleStep implements Serializable {

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
    private String field1Property;

    @Column(name = "\"Field1PST\"")
    private String field1Group;

    @Column(name = "\"Field2Ext\"")
    private String field2Property;

    @Column(name = "\"Field2PST\"")
    private String field2Group;

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
    
    @Transient
    private String field1PST;
    
    @Transient
    private String field2PST;
    
    @Transient
    private String field1Value;
    
    @Transient
    private String field2Value;
    
    @Transient
    private String field2FromRange;
    
    @Transient
    private String field2ToRange;
    
    public RuleStep() {
    }

    public RuleStep(String id) {
        this.id = id;
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

    public String getRuleID() {
        return ruleID;
    }

    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

    public int getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(int sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public int getIsStepOperator() {
        return isStepOperator;
    }

    public void setIsStepOperator(int isStepOperator) {
        this.isStepOperator = isStepOperator;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField1Type() {
        return field1Type;
    }

    public void setField1Type(String field1Type) {
        this.field1Type = field1Type;
    }

    public String getField1TemplateType() {
        return field1TemplateType;
    }

    public void setField1TemplateType(String field1TemplateType) {
        this.field1TemplateType = field1TemplateType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField2Type() {
        return field2Type;
    }

    public void setField2Type(String field2Type) {
        this.field2Type = field2Type;
    }

    public String getField2TemplateType() {
        return field2TemplateType;
    }

    public void setField2TemplateType(String field2TemplateType) {
        this.field2TemplateType = field2TemplateType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getField1Property() {
        return field1Property;
    }

    public void setField1Property(String field1Property) {
        this.field1Property = field1Property;
    }

    public String getField1Group() {
        return field1Group;
    }

    public void setField1Group(String field1Group) {
        this.field1Group = field1Group;
    }

    public String getField2Property() {
        return field2Property;
    }

    public void setField2Property(String field2Property) {
        this.field2Property = field2Property;
    }

    public String getField2Group() {
        return field2Group;
    }

    public void setField2Group(String field2Group) {
        this.field2Group = field2Group;
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

    public String getField1PST() {
        return field1PST;
    }

    public void setField1PST(String field1PST) {
        this.field1PST = field1PST;
    }

    public String getField2PST() {
        return field2PST;
    }

    public void setField2PST(String field2PST) {
        this.field2PST = field2PST;
    }

    public String getField1Value() {
        return field1Value;
    }

    public void setField1Value(String field1Value) {
        this.field1Value = field1Value;
    }

    public String getField2Value() {
        return field2Value;
    }

    public void setField2Value(String field2Value) {
        this.field2Value = field2Value;
    }

    public String getField2FromRange() {
        return field2FromRange;
    }

    public void setField2FromRange(String field2FromRange) {
        this.field2FromRange = field2FromRange;
    }

    public String getField2ToRange() {
        return field2ToRange;
    }

    public void setField2ToRange(String field2ToRange) {
        this.field2ToRange = field2ToRange;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.client);
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.ruleID);
        hash = 59 * hash + this.sequenceNo;
        hash = 59 * hash + this.isStepOperator;
        hash = 59 * hash + Objects.hashCode(this.field1);
        hash = 59 * hash + Objects.hashCode(this.field1Type);
        hash = 59 * hash + Objects.hashCode(this.field1TemplateType);
        hash = 59 * hash + Objects.hashCode(this.operator);
        hash = 59 * hash + Objects.hashCode(this.field2);
        hash = 59 * hash + Objects.hashCode(this.field2Type);
        hash = 59 * hash + Objects.hashCode(this.field2TemplateType);
        hash = 59 * hash + this.level;
        hash = 59 * hash + Objects.hashCode(this.field1Property);
        hash = 59 * hash + Objects.hashCode(this.field1Group);
        hash = 59 * hash + Objects.hashCode(this.field2Property);
        hash = 59 * hash + Objects.hashCode(this.field2Group);
        hash = 59 * hash + Objects.hashCode(this.dataType);
        hash = 59 * hash + Objects.hashCode(this.field1IsIndicator);
        hash = 59 * hash + Objects.hashCode(this.field2IsIndicator);
        hash = 59 * hash + Objects.hashCode(this.field1Template);
        hash = 59 * hash + Objects.hashCode(this.field2Template);
        hash = 59 * hash + (this.executionStatus ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.field1PST);
        hash = 59 * hash + Objects.hashCode(this.field2PST);
        hash = 59 * hash + Objects.hashCode(this.field1Value);
        hash = 59 * hash + Objects.hashCode(this.field2Value);
        hash = 59 * hash + Objects.hashCode(this.field2FromRange);
        hash = 59 * hash + Objects.hashCode(this.field2ToRange);
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
        final RuleStep other = (RuleStep) obj;
        if (this.sequenceNo != other.sequenceNo) {
            return false;
        }
        if (this.isStepOperator != other.isStepOperator) {
            return false;
        }
        if (this.level != other.level) {
            return false;
        }
        if (this.executionStatus != other.executionStatus) {
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
        if (!Objects.equals(this.field1Property, other.field1Property)) {
            return false;
        }
        if (!Objects.equals(this.field1Group, other.field1Group)) {
            return false;
        }
        if (!Objects.equals(this.field2Property, other.field2Property)) {
            return false;
        }
        if (!Objects.equals(this.field2Group, other.field2Group)) {
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
        if (!Objects.equals(this.field1Template, other.field1Template)) {
            return false;
        }
        if (!Objects.equals(this.field2Template, other.field2Template)) {
            return false;
        }
        if (!Objects.equals(this.field1PST, other.field1PST)) {
            return false;
        }
        if (!Objects.equals(this.field2PST, other.field2PST)) {
            return false;
        }
        if (!Objects.equals(this.field1Value, other.field1Value)) {
            return false;
        }
        if (!Objects.equals(this.field2Value, other.field2Value)) {
            return false;
        }
        if (!Objects.equals(this.field2FromRange, other.field2FromRange)) {
            return false;
        }
        if (!Objects.equals(this.field2ToRange, other.field2ToRange)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RuleStepNew{" + "client=" + client + ", id=" + id + ", ruleID=" + ruleID + ", sequenceNo=" + sequenceNo + ", isStepOperator=" + isStepOperator + ", field1=" + field1 + ", field1Type=" + field1Type + ", field1TemplateType=" + field1TemplateType + ", operator=" + operator + ", field2=" + field2 + ", field2Type=" + field2Type + ", field2TemplateType=" + field2TemplateType + ", level=" + level + ", field1Property=" + field1Property + ", field1Group=" + field1Group + ", field2Property=" + field2Property + ", field2Group=" + field2Group + ", dataType=" + dataType + ", field1IsIndicator=" + field1IsIndicator + ", field2IsIndicator=" + field2IsIndicator + ", field1Template=" + field1Template + ", field2Template=" + field2Template + ", executionStatus=" + executionStatus + ", field1PST=" + field1PST + ", field2PST=" + field2PST + ", field1Value=" + field1Value + ", field2Value=" + field2Value + ", field2FromRange=" + field2FromRange + ", field2ToRange=" + field2ToRange + '}';
    }
    
}
