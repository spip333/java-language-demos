package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

public class DemoCreateListFromTwoLists {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("pierre", "jacques", "jean");
        List<String> list2 = Arrays.asList("pierre", "jacques");


        p("List 1: " + list1);
        p("List 2: " + list2);
        Collection<String> result = CollectionUtils.subtract(list1, list2);
        p("Elements in list 1 not in list 2 : " + result);

    }
}
