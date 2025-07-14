import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Integer length,numOfSongs,s_size,p_size;
        String title,playlistName;
        Songs song;
        Playlist pl;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Song: ");
        s_size = Integer.parseInt(sc.nextLine());
        Songs [] s = new Songs[s_size]; 
        for(int i=0;i<s_size;i++){
            System.out.println("Enter Song "+(i+1)+" Details:");
            System.out.printf("Title: ");
            title = sc.nextLine();
            System.out.print("Length: ");
            length = Integer.parseInt(sc.nextLine());
            song = new Songs(title,length);
            s[i] = song;
        }
        for(Songs a:s){
            System.out.println(a);
        }
        System.out.print("Enter Size of the Playlist: ");
        p_size = Integer.parseInt(sc.nextLine());
        
        Playlist [] p = new Playlist[p_size]; 
        for(int i=0;i<p_size;i++){
            System.out.println("Enter Playlist "+(i+1)+" Details:");
            System.out.printf("Playlist Name: ");
            playlistName = sc.nextLine();
            System.out.print("No Of Songs: ");
            numOfSongs = Integer.parseInt(sc.nextLine());
            if(numOfSongs>s_size){
                do{
                    System.out.print("Enter Playlist size less than or eqaul to Song size(Song size mentioned is: "+s_size+"): ");
                    numOfSongs = Integer.parseInt(sc.nextLine());
                }while(numOfSongs>s_size);
            }
            pl = new Playlist(playlistName,numOfSongs);
            p[i] = pl;
        }
        for(Playlist b:p){
            System.out.println(b);
        }
    }
}