package com.hao.lzlglab.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * smart_env_detail
 */
@Data
public class SmartEnvDetail implements Serializable {
    /**
     * 唯一标识符号
     */
    private Integer id;

    /**
     * 设备地址
     */
    private String deviceAdres;

    /**
     * pm2.5浓度
     */
    private Double pm25;

    /**
     * 二氧化碳浓度
     */
    private Double co2;

    /**
     * 甲醛浓度
     */
    private Double ch2o;

    /**
     * 总挥发物浓度
     */
    private Double tvoc;

    /**
     * 温度
     */
    private Double temperature;

    /**
     * 湿度
     */
    private Double humidity;

    /**
     * 空气指数
     */
    private Double air;

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
        SmartEnvDetail other = (SmartEnvDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeviceAdres() == null ? other.getDeviceAdres() == null : this.getDeviceAdres().equals(other.getDeviceAdres()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getCo2() == null ? other.getCo2() == null : this.getCo2().equals(other.getCo2()))
            && (this.getCh2o() == null ? other.getCh2o() == null : this.getCh2o().equals(other.getCh2o()))
            && (this.getTvoc() == null ? other.getTvoc() == null : this.getTvoc().equals(other.getTvoc()))
            && (this.getTemperature() == null ? other.getTemperature() == null : this.getTemperature().equals(other.getTemperature()))
            && (this.getHumidity() == null ? other.getHumidity() == null : this.getHumidity().equals(other.getHumidity()))
            && (this.getAir() == null ? other.getAir() == null : this.getAir().equals(other.getAir()))
            && (this.getGatherDate() == null ? other.getGatherDate() == null : this.getGatherDate().equals(other.getGatherDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeviceAdres() == null) ? 0 : getDeviceAdres().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getCo2() == null) ? 0 : getCo2().hashCode());
        result = prime * result + ((getCh2o() == null) ? 0 : getCh2o().hashCode());
        result = prime * result + ((getTvoc() == null) ? 0 : getTvoc().hashCode());
        result = prime * result + ((getTemperature() == null) ? 0 : getTemperature().hashCode());
        result = prime * result + ((getHumidity() == null) ? 0 : getHumidity().hashCode());
        result = prime * result + ((getAir() == null) ? 0 : getAir().hashCode());
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
        sb.append(", pm25=").append(pm25);
        sb.append(", co2=").append(co2);
        sb.append(", ch2o=").append(ch2o);
        sb.append(", tvoc=").append(tvoc);
        sb.append(", temperature=").append(temperature);
        sb.append(", humidity=").append(humidity);
        sb.append(", air=").append(air);
        sb.append(", gatherDate=").append(gatherDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}