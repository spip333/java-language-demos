package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;

public class DemoStreamListAnyMatch {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("pierre", "jacques", "jean");
        String toFind = "pierre";
        String notToFind = "joe";
        p("Element to find : " + toFind + "; not to find: : " + notToFind + " ... in : " + list);

        if (list.stream().anyMatch(x -> toFind.equals(x))) {
            p(toFind + " found in " + list);
        } else {
            p(toFind + " not found in " + list);
        }

        if (list.stream().anyMatch(x -> notToFind.equals(x))) {
            p(notToFind + " found in " + list);
        } else {
            p(notToFind + " not found in " + list);
        }

    }
}
