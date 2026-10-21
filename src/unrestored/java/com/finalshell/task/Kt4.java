package com.finalshell.task;

import com.finalshell.core.Tb4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.BS;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Kt4 implements Runnable {
   public final Socket F;
   public final Wh2 f;

   public Kt4(Wh2 var1, Socket var2) {
      this.f = var1;
      this.F = var2;
   }

   @Override
   public void run() {
      Object var4 = 298501892220573627L;
      Ref.g(298501892220573627L, var4);
      Object var6 = 418793406764192211L;
      int var1 = ((ServerSocket)Ref.g(418793406764192211L, var6)).getLocalPort();
      Object var8 = 298501892220573627L;
      Ref.g(298501892220573627L, var8);
      Object var10 = 329223149633585311L;
      Ref.g(329223149633585311L, var10);
      Object var12 = 152539223357988449L;
      BS var2 = (BS)((HashMap)Ref.g(152539223357988449L, var12)).get(var1);
      if (var2 != null) {
         String var10007 = (String)Registry.lookupField(311768198477767120L).get(null);
         Object var10008 = Registry.lookupField(469230216286842026L).getInt(null);
         Object var14 = 611732392331370513L;
var10007 = new Kt4((String)var10008, (int)var2, (String)Ref.g(611732392331370513L, var14), Registry.lookupField(624294956745947517L).getInt(var2), null, Registry.lookupField(258191693237450664L).getInt(null));







         Object var16 = 192668626894744828L;
         var10008 = Registry.packArgs(Ref.g(192668626894744828L, var16));
         long var19 = 477058552633814652L;
         Object[] var18 = (Object[])var10008;
         Ref.h(477058552633814652L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }
      }
   }
}





