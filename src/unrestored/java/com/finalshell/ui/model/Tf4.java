package com.finalshell.ui.model;

import com.finalshell.core.Ln4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.F8;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

public class Tf4 implements Serializable {
   public Long M;
   public String s;
   public List x;
   public List k;
   public String r;
   public long q;
   public boolean u;
   public String N;
   public File X;
   public FileSystemView S;
   public String T;
   public int A;
   public boolean R;
   public boolean F;
   public boolean p;
   public long w;
   public boolean a;
   public int c;
   public String o;
   public int I;
   public int O;
   public Ln4_2 U;

   public Tf4(File var1) {
      ArrayList var10001 = new ArrayList();
      long var3 = 287326415495150566L;
      ArrayList var2 = var10001;
      Ref.s(287326415495150566L, var2, var3);
      ArrayList var10002 = new ArrayList();
      long var5 = 440020181240214312L;
      ArrayList var4 = var10002;
      Ref.s(440020181240214312L, var4, var5);
      FileSystemView var10003 = FileSystemView.getFileSystemView();
      long var7 = 390878661137144247L;
      FileSystemView var6 = var10003;
      Ref.s(390878661137144247L, var6, var7);
      Registry.lookupField(334384991298488189L).setBoolean(this, true);
      Registry.lookupField(446892190823601335L).setBoolean(this, false);
      Registry.lookupField(511004212502915120L).setBoolean(this, false);
      Registry.lookupField(397903369507915460L).setBoolean(this, false);
      Object[] var10004 = Registry.packArgs(var1);
      long var9 = 349593801287953443L;
      Object[] var8 = var10004;
      Ref.h(349593801287953443L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public Tf4() {
      ArrayList var10001 = new ArrayList();
      long var2 = 287326415495150566L;
      ArrayList var1 = var10001;
      Ref.s(287326415495150566L, var1, var2);
      ArrayList var10002 = new ArrayList();
      long var4 = 440020181240214312L;
      ArrayList var3 = var10002;
      Ref.s(440020181240214312L, var3, var4);
      FileSystemView var10003 = FileSystemView.getFileSystemView();
      long var6 = 390878661137144247L;
      FileSystemView var5 = var10003;
      Ref.s(390878661137144247L, var5, var6);
      Registry.lookupField(334384991298488189L).setBoolean(this, true);
      Registry.lookupField(446892190823601335L).setBoolean(this, false);
      Registry.lookupField(511004212502915120L).setBoolean(this, false);
      Registry.lookupField(397903369507915460L).setBoolean(this, false);
   }

   public String M$String() {
      Object var1 = 205274972020184740L;
      return (String)Ref.g(205274972020184740L, var1);
   }

   public int y(String var1) {
      String[] var10000 = F8.y();
      Object var3 = 0;
      String[] var2 = var10000;
      Object var7 = 287326415495150566L;
      List var4 = (List)Ref.g(287326415495150566L, var7);
      Object var5 = 0;

      Object var10001;
      while (true) {
         label33:
         if (var5 < var4.size()) {
            Tf4 var6 = (Tf4)var4.get((int)var5);
            if (var2 == null) {
               var10001 = var6;
               String var10002 = Registry.emptyArgs();
               long var10 = 498856411508641826L;
               Object var9 = var10002;
               var10002 = Ref.h(498856411508641826L, var9, var10);

               try {
                  var10002 = (String)var10002;
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               boolean var14 = var10002.equals(var1);
               if (var2 != null) {
                  break;
               }

               if (var14) {
                  var3 = var5;
                  if (var2 == null) {
                     break label33;
                  }
               }

               var5++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return (int)var10001;
   }

   public Ck4 o(String var1) {
      Ck4 var3 = null;
      String[] var10000 = F8.y();
      int var4 = 0;
      String[] var2 = var10000;

      Object var10001;
      while (true) {
         Object var6 = 440020181240214312L;
         if (0 < ((List)Ref.g(440020181240214312L, var6)).size()) {
            var10001 = this;
            Object var8 = 440020181240214312L;
            Ck4 var5 = (Ck4)((List)Ref.g(440020181240214312L, var8)).get(var4);
            if (var2 == null) {
               if (var2 != null) {
                  break;
               }

               String var10003 = (String)(Registry.emptyArgs());
               long var11 = 605430732347023634L;
               Object var10 = var10003;
               var10003 = Ref.h(605430732347023634L, var10, var11);

               try {
                  var10003 = (String)var10003;
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               if (var10003 == var1) {
                  var3 = var5;
               }

               var4++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return (Ck4)var10001;
   }

   public void F(String var1) {
      F8.y();
      Object var5 = 440020181240214312L;
      Iterator var3 = ((List)Ref.g(440020181240214312L, var5)).iterator();
      Tf4 var2 = this;

      while (var3.hasNext()) {
         Ck4 var4 = (Ck4)var3.next();
         String var10002 = Registry.emptyArgs();
         long var8 = 605430732347023634L;
         Object var7 = var10002;
         var10002 = Ref.h(605430732347023634L, var7, var8);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         label29: {
            boolean var14 = var10002.equals(var1);
            if (var2 == null) {
               if (!var14) {
                  break label29;
               }

               Object var9 = 440020181240214312L;
               ((List)Ref.g(440020181240214312L, var9)).remove(var4);
            }

            if (var2 == null) {
               break;
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void m(String var1) {
      F8.y();
      Object var5 = 287326415495150566L;
      Iterator var3 = ((List)Ref.g(287326415495150566L, var5)).iterator();
      Tf4 var2 = this;

      while (var3.hasNext()) {
         Tf4 var4 = (Tf4)var3.next();
         String var10002 = Registry.emptyArgs();
         long var8 = 498856411508641826L;
         Object var7 = var10002;
         var10002 = Ref.h(498856411508641826L, var7, var8);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         label29: {
            boolean var14 = var10002.equals(var1);
            if (var2 == null) {
               if (!var14) {
                  break label29;
               }

               Object var9 = 287326415495150566L;
               ((List)Ref.g(287326415495150566L, var9)).remove(var4);
            }

            if (var2 == null) {
               break;
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void q() {
      Object var1 = 287326415495150566L;
      Registry.packArgs(Ref.g(287326415495150566L, var1));
      long var3 = 340646047318521232L;
      Ref.h2(340646047318521232L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void f$void() {
      Object var1 = 440020181240214312L;
      Registry.packArgs(Ref.g(440020181240214312L, var1));
      long var3 = 283664198067068358L;
      Ref.h2(283664198067068358L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void h(String var1) {
      long var3 = 205274972020184740L;
      Ref.s(205274972020184740L, var1, var3);
   }

   public Long P() {
      Object var1 = 120089395022956007L;
      return (Long)Ref.g(120089395022956007L, var1);
   }

   public void o(Long var1) {
      long var3 = 120089395022956007L;
      Ref.s(120089395022956007L, var1, var3);
   }

   public void n(Ck4 var1) {
      Object var2 = 440020181240214312L;
      ((List)Ref.g(440020181240214312L, var2)).remove(var1);
   }

   public void I(Ck4 var1) {
      Object var2 = 440020181240214312L;
      ((List)Ref.g(440020181240214312L, var2)).add(var1);
   }

   public List f$List() {
      Object var1 = 287326415495150566L;
      return (List)Ref.g(287326415495150566L, var1);
   }

   public void b(List var1) {
      long var3 = 287326415495150566L;
      Ref.s(287326415495150566L, var1, var3);
   }

   public List M$List() {
      Object var1 = 440020181240214312L;
      return (List)Ref.g(440020181240214312L, var1);
   }

   public void P(List var1) {
      long var3 = 440020181240214312L;
      Ref.s(440020181240214312L, var1, var3);
   }

   public String p$String() {
      Object var1 = 570963718081561375L;
      return (String)Ref.g(570963718081561375L, var1);
   }

   public void x(String var1) {
      long var3 = 570963718081561375L;
      Ref.s(570963718081561375L, var1, var3);
   }

   public boolean p$boolean() {
      return Registry.lookupField(502974509297120220L).getBoolean(this);
   }

   public void v(boolean var1) {
      Registry.lookupField(502974509297120220L).setBoolean(this, var1);
   }

   public long E() {
      return Registry.lookupField(332406009674514605L).getLong(this);
   }

   public void o(long var1) {
      Registry.lookupField(332406009674514605L).setLong(this, var1);
   }

   public String k() {
      Object var1 = 534373980198691195L;
      return (String)Ref.g(534373980198691195L, var1);
   }

   public void u(String var1) {
      long var3 = 534373980198691195L;
      Ref.s(534373980198691195L, var1, var3);
   }

   public File M$File() {
      Object var1 = 548882096572174250L;
      return (File)Ref.g(548882096572174250L, var1);
   }

   public boolean z() {
      return Registry.lookupField(334384991298488189L).getBoolean(this);
   }

   public void t(File var1) {
      Registry.lookupField(334384991298488189L).setBoolean(this, true);
      long var3 = 548882096572174250L;
      Ref.s(548882096572174250L, var1, var3);
      if (var1 != null) {
      }

      Long var10002 = (long)var1.getAbsolutePath().hashCode();
      long var5 = 120089395022956007L;
      Long var4 = var10002;
      Ref.s(120089395022956007L, var4, var5);
      String var10003 = var1.getAbsolutePath();
      long var7 = 534373980198691195L;
      String var6 = var10003;
      Ref.s(534373980198691195L, var6, var7);
      Object var8 = 390878661137144247L;
      String var10005 = ((FileSystemView)Ref.g(390878661137144247L, var8)).getSystemDisplayName(var1);
      long var11 = 133073232790774573L;
      String var10 = var10005;
      Ref.s(133073232790774573L, var10, var11);
      String var10006 = var1.getName();
      long var13 = 205274972020184740L;
      String var12 = var10006;
      Ref.s(205274972020184740L, var12, var13);
      Registry.lookupField(479126713470689971L).setLong(this, var1.lastModified());
   }

   public String g() {
      Object var1 = 133073232790774573L;
      return (String)Ref.g(133073232790774573L, var1);
   }

   public void D(String var1) {
      long var3 = 133073232790774573L;
      Ref.s(133073232790774573L, var1, var3);
   }

   public int r() {
      return Registry.lookupField(429651024627034571L).getInt(this);
   }

   public void z(int var1) {
      Registry.lookupField(429651024627034571L).setInt(this, var1);
   }

   public void t(boolean var1) {
      Registry.lookupField(334384991298488189L).setBoolean(this, var1);
   }

   public boolean H() {
      return Registry.lookupField(446892190823601335L).getBoolean(this);
   }

   public void z(boolean var1) {
      Registry.lookupField(446892190823601335L).setBoolean(this, var1);
   }

   public boolean M$boolean() {
      return Registry.lookupField(511004212502915120L).getBoolean(this);
   }

   public void r(boolean var1) {
      Registry.lookupField(511004212502915120L).setBoolean(this, var1);
   }

   public long w() {
      return Registry.lookupField(479126713470689971L).getLong(this);
   }

   public void W(long var1) {
      Registry.lookupField(479126713470689971L).setLong(this, var1);
   }

   public boolean Y() {
      return Registry.lookupField(397903369507915460L).getBoolean(this);
   }

   public void J(boolean var1) {
      Registry.lookupField(397903369507915460L).setBoolean(this, var1);
   }

   public int y() {
      return Registry.lookupField(398001055604146458L).getInt(this);
   }

   public void j(int var1) {
      Registry.lookupField(398001055604146458L).setInt(this, var1);
   }

   public String C() {
      Object var1 = 171747054672934806L;
      return (String)Ref.g(171747054672934806L, var1);
   }

   public void E(String var1) {
      long var3 = 171747054672934806L;
      Ref.s(171747054672934806L, var1, var3);
   }

   public int n() {
      return Registry.lookupField(135434626698158844L).getInt(this);
   }

   public void Z(int var1) {
      Registry.lookupField(135434626698158844L).setInt(this, var1);
   }

   public int B() {
      return Registry.lookupField(138834299800738250L).getInt(this);
   }

   public void v(int var1) {
      Registry.lookupField(138834299800738250L).setInt(this, var1);
   }

   public Ln4_2 V() {
      Object var1 = 563180066072883212L;
      return (Ln4_2)Ref.g(563180066072883212L, var1);
   }

   public void p(Ln4_2 var1) {
      long var3 = 563180066072883212L;
      Ref.s(563180066072883212L, var1, var3);
   }
}





