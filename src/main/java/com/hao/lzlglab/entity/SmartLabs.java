package com.hao.lzlglab.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * smart_labs
 */
@Data
public class SmartLabs implements Serializable {
    /**
     * 实验室id
     */
    private String id;

    /**
     * 实验室名称
     */
    private String labsName;

    /**
     * 实验室描述
     */
    private String infos;

    /**
     * 网络地址（ip)
     */
    private String netAdres;

    /**
     * 控制端口(port)
     */
    private Integer port;

    /**
     * 实验室的标识
     */
    private String labsNum;

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
        SmartLabs other = (SmartLabs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLabsName() == null ? other.getLabsName() == null : this.getLabsName().equals(other.getLabsName()))
            && (this.getInfos() == null ? other.getInfos() == null : this.getInfos().equals(other.getInfos()))
            && (this.getNetAdres() == null ? other.getNetAdres() == null : this.getNetAdres().equals(other.getNetAdres()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getLabsNum() == null ? other.getLabsNum() == null : this.getLabsNum().equals(other.getLabsNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLabsName() == null) ? 0 : getLabsName().hashCode());
        result = prime * result + ((getInfos() == null) ? 0 : getInfos().hashCode());
        result = prime * result + ((getNetAdres() == null) ? 0 : getNetAdres().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getLabsNum() == null) ? 0 : getLabsNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", labsName=").append(labsName);
        sb.append(", infos=").append(infos);
        sb.append(", netAdres=").append(netAdres);
        sb.append(", port=").append(port);
        sb.append(", labsNum=").append(labsNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}