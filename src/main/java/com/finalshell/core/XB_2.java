package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;

public class XB_2 {
   public ServerSocket y;
   public int d;
   public String H;
   public int x;
   public String p;
   public int F;
   public Object v;
   public Lv4_2 R;
   public int g;

   public XB_2(int var1, String var2, int var3, String var4, int var5, Lv4_2 var6, int var7) {
      Object var10001 = new Object();
      long var11 = 488475715146941343L;
      Object var10 = var10001;
      Ref.s(488475715146941343L, var10, var11);
      long var13 = 336797495140939972L;
      Ref.s(336797495140939972L, var2, var13);
      Registry.lookupField(450411236977093372L).setInt(this, var3);
      long var15 = 460017230843248271L;
      Ref.s(460017230843248271L, var4, var15);
      Registry.lookupField(440223267543010105L).setInt(this, var5);
      Registry.lookupField(385199164122983902L).setInt(this, var1);
      long var17 = 257654343460162399L;
      Ref.s(257654343460162399L, var6, var17);
      Registry.lookupField(256861225427482174L).setInt(this, var7);

      try {
         ServerSocket var10005 = new ServerSocket(var1);
         long var19 = 451006777344254157L;
         ServerSocket var18 = var10005;
         Ref.s(451006777344254157L, var18, var19);
      } catch (IOException var28) {
         var28.printStackTrace();
         return;
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10006 = Registry.packArgs(new com.finalshell.task.Ga2(this));
      long var21 = 434592463220957006L;
      Object[] var20 = var10006;
      Ref.h(434592463220957006L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      Object var22 = 488475715146941343L;
      synchronized ((Object)Ref.g(488475715146941343L, var22)) {
         Object var24 = 488475715146941343L;
         Ref.g(488475715146941343L, var24).notifyAll();
      }
   }

   public void Y(Socket var1) {
      Object var3 = 336797495140939972L;
      String var10003 = (String)Ref.g(336797495140939972L, var3);
      int var10004 = Registry.lookupField(450411236977093372L).getInt(this);
      Object var5 = 460017230843248271L;
      String var10006 = (String)Ref.g(460017230843248271L, var5);
      Object var10007 = Registry.lookupField(440223267543010105L).getInt(this);
      Object var7 = 257654343460162399L;
var10004 = new XB_2(this, (int)var10006, (String)var10007, (int)this, (Lv4_2)Ref.g(257654343460162399L, var7), Registry.lookupField(256861225427482174L).getInt(this));


      Object[] var12 = Registry.packArgs(var1);
      long var10 = 477058552633814652L;
      Object[] var9 = var12;
      Ref.h(477058552633814652L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public int H() {
      return Registry.lookupField(385199164122983902L).getInt(this);
   }

   public void X(int var1) {
      Registry.lookupField(385199164122983902L).setInt(this, var1);
   }
}





