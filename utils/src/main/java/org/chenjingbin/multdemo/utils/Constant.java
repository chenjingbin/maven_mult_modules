package org.chenjingbin.multdemo.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 常量

 */
public class Constant {
	/** 超级管理员ID */
	public static final int SUPER_ADMIN = 1;
    public static final int SUPER_SYSTEM = 2;
	/**
	 * 菜单类型

	 */
    public enum MenuType {
        /**
         * 目录
         */
    	CATALOG(0),
        /**
         * 菜单
         */
        MENU(1),
        /**
         * 按钮
         */
        BUTTON(2);

        private int value;

        MenuType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    
    /**
     * 定时任务状态

     */
    public enum ScheduleStatus {
        /**
         * 正常
         */
    	NORMAL(0),
        /**
         * 暂停
         */
    	PAUSE(1);

        private int value;

        ScheduleStatus(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
    }

    /**
     * 云服务商
     */
    public enum CloudService {
        /**
         * 七牛云
         */
        QINIU(1),
        /**
         * 阿里云
         */
        ALIYUN(2),
        /**
         * 腾讯云
         */
        QCLOUD(3);

        private int value;

        CloudService(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    public enum CustomerSource{
        /**
         * 注册会员
         */
        CUSTOMER_SOURCE_ONE("1010","注册会员"),
        /**
         *朋友介绍
         */
        CUSTOMER_SOURCE_TWO("1011","朋友介绍"),
        /**
         *手工录入
         */
        CUSTOMER_SOURCE_THREE("1012","手工录入"),
        /**
         *客户介绍
         */
        CUSTOMER_SOURCE_FOUR("1013","客户介绍"),
        /**
         *电子商务
         */
        CUSTOMER_SOURCE_FIVE("1014","电子商务"),
        /**
         *合作伙伴
         */
        CUSTOMER_SOURCE_SIX("1015","合作伙伴"),
        /**
         *广告
         */
        CUSTOMER_SOURCE_SEVEN("1016","广告"),
        /**
         *职员引介
         */
        CUSTOMER_SOURCE_EIGHT("1017","职员引介"),
        /**
         *市场活动
         */
        CUSTOMER_SOURCE_NINE("1018","市场活动"),
        /**
         *口头传达
         */
        CUSTOMER_SOURCE_TEN("1019","口头传达"),
        /**
         *其他
         */
        CUSTOMER_SOURCE_ELEVEN("1020","其他")
                ;
        private String key;
        private String value;
        CustomerSource(String key,String value){this.key = key;this.value = value;}
        public String getKey(){return key;}
        public String getValue(){return value;}
        public static Map<String,String> map = new HashMap<>();
        public static Map<String,String> mapTemp = new HashMap<>();
        static{
            CustomerSource[] customerSources = CustomerSource.values();
            for (CustomerSource c:customerSources) {
                map.put(c.getKey(),c.getValue());
                mapTemp.put(c.getValue(),c.getKey());
            }
        }
    }

    public enum CustomerCategory{
        /**
         *
         */
        CUSTOMER_CATEGORY_ONE("1021","普通客户"),
        /**
         *
         */
        CUSTOMER_CATEGORY_TWO("1022","VIP客户"),
        /**
         *
         */
        CUSTOMER_CATEGORY_THREE("1023","老客户"),
        /**
         *
         */
        CUSTOMER_CATEGORY_FOUR("1024","代理商"),
        /**
         *
         */
        CUSTOMER_CATEGORY_FIVE("1025","供货商"),
        /**
         *
         */
        CUSTOMER_CATEGORY_SIX("1026","合作伙伴"),
        /**
         *
         */
        CUSTOMER_CATEGORY_SEVEN("1027","其他")
        ;
        private String key;
        private String value;
        CustomerCategory(String key,String value){this.key = key;this.value = value;}
        public String getKey(){return key;}
        public String getValue(){return value;}
        public static Map<String,String> map = new HashMap<>();
        public static Map<String,String> mapTemp = new HashMap<>();
        static{
            CustomerCategory[] customerCategories = CustomerCategory.values();
            for (CustomerCategory c:customerCategories) {
                map.put(c.getKey(),c.getValue());
                mapTemp.put(c.getValue(),c.getKey());
            }
        }
    }
    public enum CustomerProfession{

        CUSTOMER_PROFESSION_ONE("1085","IT"),
        CUSTOMER_PROFESSION_TWO("1086","金融业"),
        CUSTOMER_PROFESSION_THREE("1087","房地产"),
        CUSTOMER_PROFESSION_FOUR("1088","商业服务"),
        CUSTOMER_PROFESSION_FIVE("1089","运输物流"),
        CUSTOMER_PROFESSION_SIX("1090","生产"),
        CUSTOMER_PROFESSION_SEVEN("1091","政府机构"),
        CUSTOMER_PROFESSION_EIGHT("1092","文化传媒")
        ;
        private String key;
        private String value;
        CustomerProfession(String key,String value){this.key = key;this.value = value;}
        public String getKey(){return key;}
        public String getValue(){return value;}
        public static Map<String,String> map = new HashMap<>();
        public static Map<String,String> mapTemp = new HashMap<>();
        static{
            CustomerProfession[] customerProfessions = CustomerProfession.values();
            for (CustomerProfession c:customerProfessions) {
                map.put(c.getKey(),c.getValue());
                mapTemp.put(c.getValue(),c.getKey());
            }
        }
    }
}
