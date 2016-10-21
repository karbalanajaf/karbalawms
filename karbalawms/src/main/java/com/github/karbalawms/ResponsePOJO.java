package com.github.karbalawms;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by bkhezry on 10/21/2016.
 */

public class ResponsePOJO {
    @SerializedName("POINT_X")
    @Expose
    private Double pOINTX;
    @SerializedName("POINT_Y")
    @Expose
    private Double pOINTY;
    @SerializedName("Desc_")
    @Expose
    private String desc;
    @SerializedName("Type")
    @Expose
    private String type;

    /**
     * @return The pOINTX
     */
    public Double getPOINTX() {
        return pOINTX;
    }

    /**
     * @param pOINTX The POINT_X
     */
    public void setPOINTX(Double pOINTX) {
        this.pOINTX = pOINTX;
    }

    /**
     * @return The pOINTY
     */
    public Double getPOINTY() {
        return pOINTY;
    }

    /**
     * @param pOINTY The POINT_Y
     */
    public void setPOINTY(Double pOINTY) {
        this.pOINTY = pOINTY;
    }

    /**
     * @return The desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc The Desc_
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The Type
     */
    public void setType(String type) {
        this.type = type;
    }
}
