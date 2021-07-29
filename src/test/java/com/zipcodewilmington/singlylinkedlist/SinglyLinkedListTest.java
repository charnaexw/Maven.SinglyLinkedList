package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addTest(){
        //given
        int expected=1;
        SinglyLinkedList node = new SinglyLinkedList();
        node.addNode(expected);
        //when
        int actual=node.size();
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void removeTest(){
        //given
        int expected=2;
        SinglyLinkedList node = new SinglyLinkedList();
        node.addNode(7);
        node.addNode(3);
        node.addNode(2);

        //when
        node.removeNode(7);
        int actual=node.size();
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void removeTest2(){
        //given
        int expected=1;
        SinglyLinkedList node = new SinglyLinkedList();
        node.addNode(7);
        node.addNode(3);
        node.addNode(2);
        //when
        node.removeNode(7);
        node.removeNode(3);
        int actual=node.size();
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void doesItContainTest(){
        //given
        boolean expected=true;
        SinglyLinkedList node = new SinglyLinkedList();
        node.addNode(7);
        node.addNode(3);
        node.addNode(2);
        //when
        node.removeNode(7);
        boolean actual=node.contains(3);
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void doesItContainTest2(){
        //given
        boolean expected=false;
        SinglyLinkedList node = new SinglyLinkedList();
        node.addNode(7);
        node.addNode(3);
        node.addNode(2);
        //when
        node.removeNode(7);
        boolean actual=node.contains(1);
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void findIndexOfNumTest(){
        //given
        int expected=2;
        SinglyLinkedList node = new SinglyLinkedList();
        node.addNode(7);
        node.addNode(3);
        node.addNode(2);
        //when
        int actual=node.find(3);
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void findIndexOfNum_inTheFrontTest(){
        //given
        int expected=1;
        SinglyLinkedList node = new SinglyLinkedList();
        node.addNode(7);
        node.addNode(3);
        node.addNode(2);
        //when
        int actual=node.find(7);
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void findIndexOfNum_notThereTest(){
        //given
        int expected=-1;
        SinglyLinkedList node = new SinglyLinkedList();
        node.addNode(7);
        node.addNode(3);
        node.addNode(2);
        //when
        int actual=node.find(9);
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void getValueAtIndexTest(){
        //given
        int expected=7;
        SinglyLinkedList node = new SinglyLinkedList();
        node.addNode(7);
        node.addNode(3);
        node.addNode(2);
        //when
        int actual=node.get(1);
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void makingACopyTest(){
        //given
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList nod = new SinglyLinkedList();
        list.addNode(7);
        list.addNode(3);
        list.addNode(2);
        int expected =3;
        //when
        nod=list.copy();
        int actual=nod.size();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sortTest(){
        //given
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(7);
        list.addNode(3);
        list.addNode(2);
        int expected=2;
        //when
        list.sort();
        int actual= list.get(1);
        //then
        Assert.assertEquals(expected, actual);
    }

}
