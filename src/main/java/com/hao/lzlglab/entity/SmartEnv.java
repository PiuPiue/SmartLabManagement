package com.hao.lzlglab.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * smart_env
 */
@Data
public class SmartEnv implements Serializable {
    /**
     * 唯一标识符
     */
    private String id;

    /**
     * 设备地址
     */
    private String deviceAdres;

    /**
     * 环境数据标识(0-温度，1-湿度，2-co2,3-光照,4-紫外线，5-pm25)
     */
    private Integer type;

    /**
     * 环境数据值
     */
    private Double value;

    /**
     * 采集时间
     */
    private Date gatherDate;

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
        SmartEnv other = (SmartEnv) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeviceAdres() == null ? other.getDeviceAdres() == null : this.getDeviceAdres().equals(other.getDeviceAdres()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getGatherDate() == null ? other.getGatherDate() == null : this.getGatherDate().equals(other.getGatherDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeviceAdres() == null) ? 0 : getDeviceAdres().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getGatherDate() == null) ? 0 : getGatherDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deviceAdres=").append(deviceAdres);
        sb.append(", type=").append(type);
        sb.append(", value=").append(value);
        sb.append(", gatherDate=").append(gatherDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}