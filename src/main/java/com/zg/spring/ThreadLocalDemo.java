package com.zg.spring;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


/******
 * @author mads
 */
public class ThreadLocalDemo {


    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        threadLocal.set("Mads threadLocal value");

        threadLocal.get();


    }
}
