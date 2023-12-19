package evm;

public class ClientVoter {
    public static void main(String[] args) {
        Vote vote=new Vote();
        try{
            String result = vote.getVote(2023, 2008);
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
