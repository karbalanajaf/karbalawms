package com.github.karbalawms;

/**
 * Created by bkhezry on 10/20/2016.
 */

public class ConfigMap {
    public static String MAP_SERVER = "http://31.24.236.15:6080/arcgis/services/KarbalaNajaf/MapServer/WMSServer?";
    public static String GET_CAPABILITIES = "http://31.24.236.15:6080/arcgis/services/KarbalaNajaf/MapServer/WMSServer?request=GetCapabilities&service=WMS";
    public static String GET_MAP = "http://31.24.236.15:6080/arcgis/services/KarbalaNajaf/MapServer/WMSServer?request=GetMap&service=WMS";
    public static String GET_FEATURE_INFO = "http://31.24.236.15:6080/arcgis/services/KarbalaNajaf/MapServer/WMSServer?request=GetFeatureInfo&service=WMS";
    public static String BASE_URL = "http://31.24.236.15:8085/query/";
}
