package com.example.nevihationapplication;

class ItemModelPost {

    private String profilepic;
    private String name;
    private String quotation;
    private String postdata;
    private  String postimage;
   // private String pShowTime1;
    //private  String pShowTime2;

    public ItemModelPost(String profilepic, String name, String quotation, String postdata, String postimage) {
        this.profilepic = profilepic;
        this.name = name;
        this.quotation = quotation;
        this.postdata = postdata;
        this.postimage = postimage;
      //  this.pShowTime1 = pShowTime1;
      //  this.pShowTime2 = pShowTime2;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuotation() {
        return quotation;
    }

    public void setQuotation(String quotation) {
        this.quotation = quotation;
    }

    public String getPostdata() {
        return postdata;
    }

    public void setPostdata(String postdata) {
        this.postdata = postdata;
    }

    public String getPostimage() {
        return postimage;
    }

    public void setPostimage(String postimage) {
        this.postimage = postimage;
    }


}
