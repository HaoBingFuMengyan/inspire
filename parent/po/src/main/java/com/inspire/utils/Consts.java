package com.inspire.utils;


import com.google.common.collect.Maps;
import com.inspire.consts.IConst;

import java.util.Map;

public class Consts {

    public   static   final   int  YES=1;
    public   static   final   int  NO=0;
    public 	 static   final   int  NOTHING=-1;

    private static  Map<Integer,String> map(IConst[] cs){

        Map<Integer,String> m= Maps.newLinkedHashMap();
        for(IConst c:cs ){
            m.put(c.val(), c.label());
        }
        return m;
    }
    public static  Map<String,String> smap(IConst[] cs){
        Map<String,String> m=Maps.newLinkedHashMap();
        for(IConst c:cs ){
            m.put(String.valueOf(c.val()), c.label());
        }
        return m;
    }
    //判断是否为真
    public static boolean isTrue(int i)
    {
        if(i==NO)
            return false;
        else
            return true;

    }
    //判断是否为假
    public static boolean isFalse(int i)
    {
        if(i==NO)
            return true;
        else
            return false;

    }

    public static enum BoolType implements  IConst{
        NO(0,"否"),
        YES(1,"是");
        public  static BoolType get(int i){
            switch(i)
            {
                case 0:
                    return BoolType.NO;
                case 1:
                    return BoolType.YES;
            }
            return null;
        }


        private   int   nCode ;
        private   String   nLabel ;
        private   BoolType ( int   _nCode,String _nlabel) {

            this. nCode  = _nCode;
            this.nLabel=_nlabel;
        }

        @Override
        public int val(){
            return nCode;
        }
        @Override
        public String label(){
            return nLabel;
        }
        @Override
        public String getLabel(){
            return nLabel;
        }
        @Override
        public int getVal(){
            return nCode;
        }
        @Override
        public IConst[] vals(){
            return BoolType.values();
        }

        @Override
        public IConst valof(String str) {

            return BoolType.valueOf(str);
        }
        public static Map<Integer,String> map(){
            return Consts.map(BoolType.values());
        }

        @Override
        public boolean isEq(int i) {

            return nCode==i;
        }

        @Override
        public boolean isNot(int i) {

            return nCode!=i;
        }

    }

    public static enum MemberType implements IConst{
        EXCHANGE(0,"交易中心"),
        MEMBER(1,"交易会员"),
        BANK(3,"资方"),
        CHARGE(8,"代理公司");
        public static MemberType get(int i){
            switch(i)
            {
                case 0:
                    return MemberType.EXCHANGE;
                case 1:
                    return MemberType.MEMBER;
                case 3:
                    return MemberType.BANK;
                case 8:
                    return MemberType.CHARGE;
            }
            return null;
        }


        private   int   nCode ;
        private   String   nLabel ;
        private   MemberType ( int   _nCode,String _nlabel) {

            this. nCode  = _nCode;
            this.nLabel=_nlabel;
        }

        @Override
        public int val(){
            return nCode;
        }
        @Override
        public String label(){
            return nLabel;
        }
        @Override
        public String getLabel(){
            return nLabel;
        }
        @Override
        public int getVal(){
            return nCode;
        }
        @Override
        public IConst[] vals(){
            return MemberType.values();
        }

        @Override
        public IConst valof(String str) {

            return MemberType.valueOf(str);
        }
        public static Map<Integer,String> map(){
            return Consts.map(MemberType.values());
        }

        @Override
        public boolean isEq(int i) {

            return nCode==i;
        }

        @Override
        public boolean isNot(int i) {

            return nCode!=i;
        }
    }

    public static enum MemberStatus implements  IConst{
        WAIT(0,"待激活"),
        CHECK(1,"待审核"),
        REJECT(2,"被拒绝"),
        NORMAL(3 ,"正常"),
        FLEEZE(4 ,"冻结"),
        EDIT(5,"待完善资料");
        public  static MemberStatus get(int i){
            switch(i)
            {
                case 0:
                    return MemberStatus.WAIT;
                case 1:
                    return MemberStatus.CHECK;
                case 2:
                    return MemberStatus. REJECT;
                case 3 :
                    return MemberStatus.NORMAL;
                case 4 :
                    return MemberStatus.FLEEZE;
                case 5:
                    return MemberStatus.EDIT;
            }
            return null;
        }


        private   int   nCode ;
        private   String   nLabel ;
        private   MemberStatus ( int   _nCode,String _nlabel) {

            this. nCode  = _nCode;
            this.nLabel=_nlabel;
        }

        @Override
        public int val(){
            return nCode;
        }
        @Override
        public String label(){
            return nLabel;
        }
        @Override
        public String getLabel(){
            return nLabel;
        }
        @Override
        public int getVal(){
            return nCode;
        }
        @Override
        public IConst[] vals(){
            return MemberStatus.values();
        }

        @Override
        public IConst valof(String str) {

            return MemberStatus.valueOf(str);
        }
        public static Map<Integer,String> map(){
            return Consts.map(MemberStatus.values());
        }

        @Override
        public boolean isEq(int i) {

            return nCode==i;
        }

        @Override
        public boolean isNot(int i) {

            return nCode!=i;
        }
    }

    public static enum AuthenticateType implements  IConst{
        No(0,"注册会员"),
        PERSONAL(10,"个人认证"),
        Company(20,"企业认证");
        public  static AuthenticateType get(int i){
            switch(i)
            {
                case 0:
                    return AuthenticateType.No;
                case 10:
                    return AuthenticateType.PERSONAL;
                case 20:
                    return AuthenticateType.Company;
            }
            return null;
        }


        private   int   nCode ;
        private   String   nLabel ;
        private   AuthenticateType ( int   _nCode,String _nlabel) {

            this. nCode  = _nCode;
            this.nLabel=_nlabel;
        }

        @Override
        public int val(){
            return nCode;
        }
        @Override
        public String label(){
            return nLabel;
        }
        @Override
        public String getLabel(){
            return nLabel;
        }
        @Override
        public int getVal(){
            return nCode;
        }
        @Override
        public IConst[] vals(){
            return AuthenticateType.values();
        }

        @Override
        public IConst valof(String str) {

            return AuthenticateType.valueOf(str);
        }
        public static Map<Integer,String> map(){
            return Consts.map(AuthenticateType.values());
        }

        @Override
        public boolean isEq(int i) {

            return nCode==i;
        }

        @Override
        public boolean isNot(int i) {

            return nCode!=i;
        }

    }
}
