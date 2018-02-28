package com.abandonzhang.java.io.bio.objectstreams;

import java.io.*;

/**
 * @author zhangzhipeng02@meituan.com.
 * <p>
 * 2018/2/8.
 */
public class WriteObject {

    public static class MyObject {}

    public static class MyObjectSerialize implements Serializable {
        int key;
        transient int tValue;
    }

    public static class MyObjectExternalize implements Externalizable {

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {

        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        }
    }

    public static void main(String[] args) {
        MyObjectSerialize obj = new MyObjectSerialize();
        System.out.println("obj is instanceof Serializable? " + Serializable.class.isInstance(obj));
        try {
            ObjectOutputStream oos = new ObjectOutputStream(System.out);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
