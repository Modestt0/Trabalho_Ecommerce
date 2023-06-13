package br.ecommerce.caesdaeliza;

import br.ecommerce.caesdaeliza.database.ISQLBase;

import java.util.Scanner;

public class ECommerce {

    private static ECommerce instance;

    private boolean isRunning;
    private ISQLBase sqlDriver;

    public ECommerce() {
        instance = this;
    }

    public void start()
    {
        System.out.println("Bem vindo ao e-commerce de dogs - GUI.");

        /* Load config from disk. */


        /* Load data from disk. */


        /* Program loop. */
        Scanner scanner = new Scanner(System.in);

        this.isRunning = true;
        while (this.isRunning)
        {
            String input = scanner.nextLine().toLowerCase();

            switch (input)
            {
                case "menu":
                {

                    break;
                }

                case "sair": {
                    this.isRunning = false;
                    break;
                }

                default: {
                    System.out.println("Comando inválido, tente novamente.");
                    break;
                }
            }
        }

        scanner.close();
        System.out.println("Obrigado por usar o e-commerce de dogs - GUI.");
    }

    public static ECommerce GetInstance()
    {
        if (instance == null) {
            instance = new ECommerce();
        }
        return instance;
    }
}
