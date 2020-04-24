/* 
 * This class was generated by the JDS command line tool.
 * 
 * It was created by the user SBSS_19220038074936318185415652640319701600333637668158810727543328814
 * on the HANA system mo-d34b9d109:30015 
 * for CDS entities contained inside the schema 3F15CB45A62849F8834FFBA2B4C866CB.
 * 
 * Time of creation: 2016/10/04 15:24:02
 * 
 */
package com.sap.iot.ain.rules.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "\"sap.ain.metaData::Rules.RuleRun\"")
@IdClass(RuleRunPK.class)
public class RuleRun implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "\"Client\"", nullable = true, length = 32)
    private String client;

    @Id
    @Column(name = "\"ID\"", nullable = true, length = 32)
    private String id;

    @Column(name = "\"RuleID\"", length = 200)
    private String ruleId;

    @Column(name = "\"SubjectID\"", length = 200)
    private String subjectId;

    @Column(name = "\"Timestamp\"")
    private Timestamp timestamp;

    @Column(name = "\"HasResult\"", length = 10)
    private String hasResult;

    @Transient
    private List<ResultAttributes> resultAttributesList;

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

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getHasResult() {
        return hasResult;
    }

    public void setHasResult(String hasResult) {
        this.hasResult = hasResult;
    }

    public List<ResultAttributes> getResultAttributesList() {
        return resultAttributesList;
    }

    public void setResultAttributesList(List<ResultAttributes> resultAttributesList) {
        this.resultAttributesList = resultAttributesList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.client);
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.ruleId);
        hash = 11 * hash + Objects.hashCode(this.subjectId);
        hash = 11 * hash + Objects.hashCode(this.timestamp);
        hash = 11 * hash + Objects.hashCode(this.hasResult);
        hash = 11 * hash + Objects.hashCode(this.resultAttributesList);
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
        final RuleRun other = (RuleRun) obj;
        if (!Objects.equals(this.client, other.client)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.ruleId, other.ruleId)) {
            return false;
        }
        if (!Objects.equals(this.subjectId, other.subjectId)) {
            return false;
        }
        if (!Objects.equals(this.hasResult, other.hasResult)) {
            return false;
        }
        if (!Objects.equals(this.timestamp, other.timestamp)) {
            return false;
        }
        if (!Objects.equals(this.resultAttributesList, other.resultAttributesList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RuleRun{" + "client=" + client + ", id=" + id + ", ruleId=" + ruleId + ", subjectId=" + subjectId + ", timestamp=" + timestamp + ", hasResult=" + hasResult + ", resultAttributesList=" + resultAttributesList + '}';
    }

}
