package com.test.queue;

/**
 * Created by lixiangwei2 on 2017/3/2.
 */
public class TestDriver {

    ThreadPoolManager tpm = ThreadPoolManager.newInstance();

    public void sendMsg( String msg ) {

        tpm.addLogMsg( msg + "记录一条日志 " );
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new TestDriver().sendMsg( Integer.toString( i ) );
        }

        //new TestDriver().sendMsg("发起一条对象" );
    }
}
