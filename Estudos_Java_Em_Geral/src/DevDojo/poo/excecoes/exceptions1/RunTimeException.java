package DevDojo.poo.excecoes.exceptions1;

public class RunTimeException {

    // Exception tratamento para o sistema
    // Checked = precisa ser tratada pelo sistema

    // RuntimeException tratamento do código programado
    // Unchecked = precisa ser tratada mas maior parte dos erros vem do código do programador


    public static void main(String[] args) {


        // Tenda acessar algo que não existe
        //NullPointerException
//        Object object = null;
//        System.out.println("Error NullPointerException " + object.toString());


        // tentar acessar uma posição que não existe
        //error ArrayIndexOutOfBoundsException
        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }


}
