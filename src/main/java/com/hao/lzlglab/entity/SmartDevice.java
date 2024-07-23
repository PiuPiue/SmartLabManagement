package com.hao.lzlglab.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * smart_device
 */
@Data
public class SmartDevice implements Serializable {
    private String id;

    private String deviceName;

    private String deviceAddr;

    private String deviceType;

    private String labsId;

    private String open;

    private String close;

    private Integer maxThreshold;

    private Integer minThreshold;

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
        SmartDevice other = (SmartDevice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeviceName() == null ? other.getDeviceName() == null : this.getDeviceName().equals(other.getDeviceName()))
            && (this.getDeviceAddr() == null ? other.getDeviceAddr() == null : this.getDeviceAddr().equals(other.getDeviceAddr()))
            && (this.getDeviceType() == null ? other.getDeviceType() == null : this.getDeviceType().equals(other.getDeviceType()))
            && (this.getLabsId() == null ? other.getLabsId() == null : this.getLabsId().equals(other.getLabsId()))
            && (this.getOpen() == null ? other.getOpen() == null : this.getOpen().equals(other.getOpen()))
            && (this.getClose() == null ? other.getClose() == null : this.getClose().equals(other.getClose()))
            && (this.getMaxThreshold() == null ? other.getMaxThreshold() == null : this.getMaxThreshold().equals(other.getMaxThreshold()))
            && (this.getMinThreshold() == null ? other.getMinThreshold() == null : this.getMinThreshold().equals(other.getMinThreshold()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        result = prime * result + ((getDeviceAddr() == null) ? 0 : getDeviceAddr().hashCode());
        result = prime * result + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        result = prime * result + ((getLabsId() == null) ? 0 : getLabsId().hashCode());
        result = prime * result + ((getOpen() == null) ? 0 : getOpen().hashCode());
        result = prime * result + ((getClose() == null) ? 0 : getClose().hashCode());
        result = prime * result + ((getMaxThreshold() == null) ? 0 : getMaxThreshold().hashCode());
        result = prime * result + ((getMinThreshold() == null) ? 0 : getMinThreshold().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", deviceAddr=").append(deviceAddr);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", labsId=").append(labsId);
        sb.append(", open=").append(open);
        sb.append(", close=").append(close);
        sb.append(", maxThreshold=").append(maxThreshold);
        sb.append(", minThreshold=").append(minThreshold);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}