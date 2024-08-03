package edu.ifsc.gof.strategy2;

import edu.ifsc.gof.strategy2.interfaces.MsgStrategy;
import edu.ifsc.gof.strategy2.model.Comunicado;
import edu.ifsc.gof.strategy2.strategies.Email;
import edu.ifsc.gof.strategy2.strategies.Push;
import edu.ifsc.gof.strategy2.strategies.SMS;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GofStrategy {
    private static Map<Integer, String> tipoNotif = new HashMap<>();
    private static Map<Integer, MsgStrategy> strategies = new HashMap<>();
    private static Scanner in = new Scanner(System.in);
    private static Comunicado comunicado = new Comunicado();
    
    static {
        tipoNotif.put(1, "Email");
        tipoNotif.put(2, "SMS");
        tipoNotif.put(3, "Push");
    }

    static {
        strategies.put(1, new Email());
        strategies.put(2, new SMS());
        strategies.put(3, new Push());
    }

    public static void main(String[] args) {
        
        String msg;
        System.out.println("Por favor, digite o comunicado a ser enviado: ");
        msg = in.nextLine();
        
        System.out.println("Agora, selecione a forma de envio:" + "\n" +
            "1 - Email" + "\n" +
            "2 - SMS" + "\n" +
            "3 - Push");        
        int tipo = in.nextInt();
        
        if (tipo >= 1 && tipo <= 3) {
            comunicado.enviar(strategies.get(tipo), msg);
        } else {
            System.out.println("Forma de envio inválida!");
        }
    }
    
}
