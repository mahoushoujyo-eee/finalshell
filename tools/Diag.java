import java.io.*; import java.lang.reflect.*; import java.net.*; import java.nio.charset.StandardCharsets; import java.nio.file.*; import java.util.*;

public class Diag {
    public static void main(String[] a) throws Exception {
        Class<?> c = load(Paths.get(a[0]));
        Field fa=c.getDeclaredField("a"); fa.setAccessible(true);
        Field fb=c.getDeclaredField("b"); fb.setAccessible(true);
        Object[] A=(Object[])fa.get(null); String[] B=(String[])fb.get(null);
        Method al=c.getDeclaredMethod("a",long.class); al.setAccessible(true);
        Method dl=c.getDeclaredMethod("d",long.class); dl.setAccessible(true);
        Method cl=c.getDeclaredMethod("c",long.class); cl.setAccessible(true);
        System.out.println("A.len="+A.length+" B.len="+B.length);
        // sample: read first 3 method rows and first 3 field rows from reflect.tsv
        List<String[]> rows = new ArrayList<>();
        for (String line : Files.readAllLines(Paths.get(a[1]), StandardCharsets.UTF_8)) {
            String[] p = line.split("\t");
            if (p.length>=5) rows.add(p);
        }
        int shown=0;
        for (String[] r : rows) {
            if (!r[0].equals("d")) continue;
            long key=Long.parseLong(r[1]);
            int idx=(Integer)al.invoke(null,key);
            String desc=B[idx];
            System.out.println("KEY="+key+" idx="+idx+" tsvDecl="+r[3]);
            System.out.println("   desc="+esc(desc));
            // classKey = part0 of desc
            String[] parts=desc.split("\u0008",-1);
            long ck=Long.parseLong(parts[0],36);
            int cidx=(Integer)al.invoke(null,ck);
            Object o=A[cidx];
            System.out.println("   classKey="+parts[0]+" cidx="+cidx+" A[cidx]="+(o==null?"null":o.getClass().getName()+" "+o)+"  B[cidx]="+B[cidx]);
            try { Method m=(Method)dl.invoke(null,key);
                System.out.println("   RESOLVED Method: "+m+"  decl="+m.getDeclaringClass().getName()+" static="+java.lang.reflect.Modifier.isStatic(m.getModifiers()));
            } catch(Throwable t){ System.out.println("   RESOLVE FAIL "+t.getCause()); }
            if(++shown>=4) break;
        }
        shown=0;
        for (String[] r : rows) {
            if (!r[0].equals("c")) continue;
            long key=Long.parseLong(r[1]);
            try { Field f=(Field)cl.invoke(null,key);
                System.out.println("FIELD KEY="+key+" -> "+f+" decl="+f.getDeclaringClass().getName()+" type="+f.getType().getName());
            } catch(Throwable t){ System.out.println("FIELD KEY="+key+" FAIL "+t.getCause()); }
            if(++shown>=4) break;
        }
    }
    static String esc(String s){StringBuilder b=new StringBuilder();for(int i=0;i<s.length();i++){char c=s.charAt(i);if(c==8)b.append("\b");else b.append(c);}return b.toString();}
    static Class<?> load(Path jar) throws Exception {
        final URL[] urls={jar.toUri().toURL()};
        ClassLoader parent=ClassLoader.getSystemClassLoader();
        ClassLoader l=new URLClassLoader(urls,parent){
            @Override protected Class<?> loadClass(String n, boolean r) throws ClassNotFoundException {
                synchronized(getClassLoadingLock(n)){Class<?> c=findLoadedClass(n); if(c==null){try{c=super.loadClass(n,false);}catch(ClassNotFoundException e){throw e;}} if(r)resolveClass(c); return c;}
            }
        };
        return Class.forName("com.c", true, l);
    }
}
