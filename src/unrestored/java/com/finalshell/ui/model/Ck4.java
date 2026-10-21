package com.finalshell.ui.model;

import com.finalshell.core.Ln4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import javax.swing.filechooser.FileSystemView;

public class Ck4 implements Serializable {
   public long f;
   public long L;
   public String S;
   public long r;
   public String X;
   public Timestamp H;
   public File v;
   public int R;
   public String o;
   public String t;
   public boolean I;
   public long x;
   public int V;
   public boolean G;
   public int a;
   public String m;
   public String q;
   public int y;
   public int l;
   public static FileSystemView U;
   public Ln4_2 O;

   public Ck4(File var1) {
      Ref.s(124607656514820922L, this, false);
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 325634526741383265L;
      Object[] var2 = var10001;
      Ref.h(325634526741383265L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4.getTargetException());
      }
   }

   public Ck4() {
      Ref.s(124607656514820922L, this, false);
   }

   public String T$String() {
      Object var1 = 147082674119486934L;
      return (String)Ref.g(147082674119486934L, var1);
   }

   public void H(String var1) {
      long var3 = 147082674119486934L;
      Ref.s(147082674119486934L, var1, var3);
   }

   public long m() {
      return ((Long)Ref.g(535403621757972923L, this)).longValue();
   }

   public void R(long var1) {
      Ref.s(535403621757972923L, this, var1);
   }

   public String a() {
      Object var1 = 291178179411629597L;
      return (String)Ref.g(291178179411629597L, var1);
   }

   public void T(String var1) {
      long var3 = 291178179411629597L;
      Ref.s(291178179411629597L, var1, var3);
   }

   public long T$long() {
      return ((Long)Ref.g(555971785129875340L, this)).longValue();
   }

   public void q(long var1) {
      Ref.s(555971785129875340L, this, var1);
   }

   public long V() {
      return ((Long)Ref.g(486528967412993197L, this)).longValue();
   }

   public void w(long var1) {
      Ref.s(486528967412993197L, this, var1);
   }

   public Timestamp U() {
      Object var1 = 630397883516711882L;
      return (Timestamp)Ref.g(630397883516711882L, var1);
   }

   public void H(Timestamp var1) {
      long var3 = 630397883516711882L;
      Ref.s(630397883516711882L, var1, var3);
   }

   public boolean M$boolean() {
      Object var1 = 319061412527090643L;
      return (File)Ref.g(319061412527090643L, var1) != null;
   }

   public File i() {
      Object var1 = 319061412527090643L;
      return (File)Ref.g(319061412527090643L, var1);
   }

   public void N(File var1) {
      long var3 = 319061412527090643L;
      Ref.s(319061412527090643L, var1, var3);
      String var10002 = var1.getAbsolutePath();
      long var5 = 558196263811559628L;
      String var4 = var10002;
      Ref.s(558196263811559628L, var4, var5);
      String var10003 = ((FileSystemView)Ref.g(442299594682816259L, null)).getSystemDisplayName(var1);
      long var7 = 305970725490929616L;
      String var6 = var10003;
      Ref.s(305970725490929616L, var6, var7);
      String var10004 = var1.getName();
      long var9 = 291178179411629597L;
      String var8 = var10004;
      Ref.s(291178179411629597L, var8, var9);
      Object[] var10005 = Registry.e(var1.length());
      long var11 = 130797771737578875L;
      Object[] var10 = var10005;
      Ref.h(130797771737578875L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw new RuntimeException(var12.getTargetException());
      }

      Ref.setLong(359393494525141082L, this, var1.lastModified());
   }

   public int p() {
      return ((Integer)Ref.g(133706834413389952L, this)).intValue();
   }

   public void l(int var1) {
      Ref.s(133706834413389952L, this, var1);
   }

   public String d() {
      Object var1 = 558196263811559628L;
      return (String)Ref.g(558196263811559628L, var1);
   }

   public void o(String var1) {
      long var3 = 558196263811559628L;
      Ref.s(558196263811559628L, var1, var3);
   }

   public String y() {
      Object var1 = 305970725490929616L;
      return (String)Ref.g(305970725490929616L, var1);
   }

   public void Q(String var1) {
      long var3 = 305970725490929616L;
      Ref.s(305970725490929616L, var1, var3);
   }

   public void B(boolean var1) {
      Ref.s(227534702578793828L, this, var1);
   }

   public long Q() {
      return ((Long)Ref.g(359393494525141082L, this)).longValue();
   }

   public void Q(long var1) {
      Ref.s(359393494525141082L, this, var1);
   }

   public int I() {
      return ((Integer)Ref.g(284794950070679028L, this)).intValue();
   }

   public void U(int var1) {
      Ref.s(284794950070679028L, this, var1);
   }

   public boolean l() {
      return ((Boolean)Ref.g(124607656514820922L, this)).booleanValue();
   }

   public void d(boolean var1) {
      Ref.s(124607656514820922L, this, var1);
   }

   public int v() {
      return ((Integer)Ref.g(587530985709747542L, this)).intValue();
   }

   public void s(int var1) {
      Ref.s(587530985709747542L, this, var1);
   }

   public String S() {
      Object var1 = 133527229147317349L;
      return (String)Ref.g(133527229147317349L, var1);
   }

   public void W(String var1) {
      long var3 = 133527229147317349L;
      Ref.s(133527229147317349L, var1, var3);
   }

   public String M$String() {
      Object var1 = 291210318993119174L;
      return (String)Ref.g(291210318993119174L, var1);
   }

   public void h(String var1) {
      long var3 = 291210318993119174L;
      Ref.s(291210318993119174L, var1, var3);
   }

   public int f() {
      return ((Integer)Ref.g(271149342293157747L, this)).intValue();
   }

   public void z(int var1) {
      Ref.s(271149342293157747L, this, var1);
   }

   public int s() {
      return ((Integer)Ref.g(401764158009500979L, this)).intValue();
   }

   public void a(int var1) {
      Ref.s(401764158009500979L, this, var1);
   }

   public Ln4_2 u() {
      Object var1 = 197217865165611258L;
      return (Ln4_2)Ref.g(197217865165611258L, var1);
   }

   public void J(Ln4_2 var1) {
      long var3 = 197217865165611258L;
      Ref.s(197217865165611258L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      Ref.setField(0L, null, FileSystemView.getFileSystemView());
   }
}





