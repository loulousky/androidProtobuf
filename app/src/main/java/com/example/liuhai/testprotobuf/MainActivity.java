package com.example.liuhai.testprotobuf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建
        AddressBookProtos.Person person=AddressBookProtos.Person.newBuilder().
                setId(10).
                setEmail("185587041@qq.com").setName("liuhai").
                setPhone(1,AddressBookProtos.Person.PhoneNumber.newBuilder().setNumber("111").build()).build();
        //AddressBookProtos.Person.parseFrom() 从流中得数据拿到对象
        //person.writeTo();写数据类s




    }
}
