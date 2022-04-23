public class Codec {
    HashMap<String, String> hmap = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        String s = getEncodedCode();
        String key = "http://tinyurl.com/" + s;
        hmap.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hmap.get(shortUrl);
    }
    
    
    public String getEncodedCode(){
        String str = "";
        int max = 122, min = 48;
        for(int i = 0; i <= 5; i++){
            char c = (char)Math.floor(Math.random()*(max-min+1)+min);
            str += c;
        }
        return str;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));