/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import org.l.F;
import org.l.S;
import org.l.W;
import org.l.x;

public class q
extends x {
    public q(File file, FilenameFilter filenameFilter, FilenameFilter filenameFilter2) {
        super(new W(file, filenameFilter, filenameFilter2));
    }

    public static Iterator i(File[] fileArray, FilenameFilter filenameFilter, FilenameFilter filenameFilter2) {
        ArrayList<q> arrayList = new ArrayList<q>();
        File[] fileArray2 = fileArray;
        int n10 = fileArray2.length;
        boolean bl = F.G();
        for (int i2 = 0; i2 < n10; ++i2) {
            File file = fileArray2[i2];
            arrayList.add(new q(file, filenameFilter, filenameFilter2));
            if (!bl) continue;
        }
        return new S(arrayList.iterator(), 2);
    }

    private static ArrayList t(Object object) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(object);
        return arrayList;
    }

    static ArrayList V(Object object) {
        return q.t(object);
    }
}

