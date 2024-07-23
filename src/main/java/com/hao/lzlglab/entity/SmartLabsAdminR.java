package com.hao.lzlglab.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * smart_labs_admin_r
 */
@Data
public class SmartLabsAdminR implements Serializable {
    /**
     * 唯一标识符
     */
    private String id;

    /**
     * 实验室id
     */
    private String labsId;

    /**
     * 管理员id
     */
    private String adminId;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SmartLabsAdminR other = (SmartLabsAdminR) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLabsId() == null ? other.getLabsId() == null : this.getLabsId().equals(other.getLabsId()))
            && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLabsId() == null) ? 0 : getLabsId().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", labsId=").append(labsId);
        sb.append(", adminId=").append(adminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}