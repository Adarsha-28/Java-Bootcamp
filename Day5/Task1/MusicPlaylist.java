class Songs{
    String title;
    Integer length;
    public Songs(){

    }
    public Songs(String title,Integer length){
        this.title=title;
        this.length=length;
    }

    public void setTitle(){
        this.title=title;
    }
    public void setLength(){
        this.length=length;
    }

    public String getTitle(){
        return title;
    }
    public Integer getLength(){
        return length;
    }    

    @Override
    public String toString(){
        return "MusicPlaylist [Song Title: "+title+", Song Length: "+length+"]";
    }
} 

class Playlist{
    String PlaylistName;
    Integer numOfSongs;
    public Playlist(){

    }
    public Playlist(String PlaylistName,Integer numOfSongs){
        this.PlaylistName=PlaylistName;
        this.numOfSongs=numOfSongs;
    }

    public void setPlaylistName(){
        this.PlaylistName=PlaylistName;
    }
    public void setnumOfSongs(){
        this.numOfSongs=numOfSongs;
    }

    public String getPlaylistName(){
        return PlaylistName;
    }
    public Integer getnumOfSongs(){
        return numOfSongs;
    }    

    @Override
    public String toString(){
        return "MusicPlaylist [Playlist Name: "+PlaylistName+", No Of Songs: "+numOfSongs+"]";
    }
} 