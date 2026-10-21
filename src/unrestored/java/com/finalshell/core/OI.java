package com.finalshell.core;

import com.finalshell.reflect.Ref;
import java.util.HashMap;
import javax.swing.JFrame;

public class OI {
   public HashMap b;

   public OI() {
      HashMap var10001 = new HashMap();
      long var2 = 438526059822996541L;
      HashMap var1 = var10001;
      Ref.s(438526059822996541L, var1, var2);
   }

   public void j(String var1, JFrame var2) {
      Object var3 = 438526059822996541L;
      ((HashMap)Ref.g(438526059822996541L, var3)).put(var1, var2);
   }

   public JFrame c(String var1) {
      Object var2 = 438526059822996541L;
      return (JFrame)((HashMap)Ref.g(438526059822996541L, var2)).get(var1);
   }

   public void N(String var1) {
      Object var2 = 438526059822996541L;
      ((HashMap)Ref.g(438526059822996541L, var2)).remove(var1);
   }

   public boolean H(String var1) {
      Object var2 = 438526059822996541L;
      return ((HashMap)Ref.g(438526059822996541L, var2)).containsKey(var1);
   }
}





