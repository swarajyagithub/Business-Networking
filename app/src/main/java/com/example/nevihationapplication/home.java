package com.example.nevihationapplication;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class home extends Fragment {

    GridView gridViewPost;
    AdapterPost adapterPost;
    AdapterComment adapterComment;


    TextView t1;
    TextView t2;
    TextView t3;

    TextView ans;

    ArrayList<String> arrayImageP=new ArrayList<String>();
    ArrayList<String> arrayNmae=new ArrayList<String>();
    ArrayList<String> arrayQu=new ArrayList<String>();
    ArrayList<String> arrayPost=new ArrayList<String>();
    ArrayList<String> arrayImagePost=new ArrayList<String>();
    ArrayList<String> arrayPincode=new ArrayList<String>();

    ArrayList<String> arrayyear=new ArrayList<String>();
    ArrayList<String> arraymonth=new ArrayList<String>();
    ArrayList<String> arraydate=new ArrayList<String>();
    ArrayList<String> arrayhour=new ArrayList<String>();
    ArrayList<String> arrayminutes=new ArrayList<String>();
    ArrayList<Integer> arrayID=new ArrayList<Integer>();


    ArrayList<String> arrayyearL=new ArrayList<String>();
    ArrayList<String> arraymonthL=new ArrayList<String>();
    ArrayList<String> arraydateL=new ArrayList<String>();
    ArrayList<String> arrayhourL=new ArrayList<String>();
    ArrayList<String> arrayminutesL=new ArrayList<String>();

    ArrayList<String> arrayShowTime1=new ArrayList<String>();
    ArrayList<String> arrayShowTime2=new ArrayList<String>();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment home.
     */
    // TODO: Rename and change types and number of parameters
    public static home newInstance(String param1, String param2) {
        home fragment = new home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        final singleDatabase db=new singleDatabase(getActivity());
        arrayImageP.clear();
        arrayNmae.clear();
        arrayQu.clear();
        arrayPost.clear();
        arrayImagePost.clear();
        arrayPincode.clear();


          arrayminutes.clear();
          arrayhour.clear();
          arraydate.clear();
          arraymonth.clear();
          arrayyear.clear();
          arrayID.clear();

          arrayminutesL.clear();
           arrayhourL.clear();
           arraydateL.clear();
            arraymonthL.clear();
            arrayyearL.clear();

            arrayShowTime1.clear();
           arrayShowTime2.clear();



        logindialogbox l=new logindialogbox();
        String s=l.s1;

        Cursor c1=db.getFirstNameNei(s);
        while (c1.moveToNext())
        {
            String pincode=c1.getString(11);
            arrayPincode.add(pincode);
        }



        Cursor c2 = db.getPinCodeDataNei(arrayPincode.get(0));
        while (c2.moveToNext()) {
            String image = c2.getString(15);
            String Name = c2.getString(11);
            String postd = c2.getString(9);
            String qutq=c2.getString(7);
            String postimage = c2.getString(8);

            arrayImageP.add(image);
            arrayNmae.add(Name);
            arrayQu.add(qutq);
            arrayPost.add(postd);
            arrayImagePost.add(postimage);

        }

        Cursor cursor2=db.getPinCodeDataNei(arrayPincode.get(0));

            while (cursor2.moveToNext()) {
                String year = cursor2.getString(17);
                String month = cursor2.getString(16);
                String date = cursor2.getString(12);
                String hour = cursor2.getString(18);
                String minutes = cursor2.getString(13);
                int id = cursor2.getInt(0);
                arrayyear.add(year);
                arraymonth.add(month);
                arraydate.add(date);
                arrayhour.add(hour);
                arrayminutes.add(minutes);
                arrayID.add(id);

            }






        // Cursor cursor1=db.getLoginDateNei(s);
       // try {
         //   while (cursor1.moveToNext()) {
               // String lyear = cursor1.getString(2);
              //  String lmonth = cursor1.getString(3);
              //  String ldate = cursor1.getString(4);
               // String lhour = cursor1.getString(6);
              //  String lminutes = cursor1.getString(5);
             //   arrayyearL.add(lyear);
              //  arraymonthL.add(lmonth);
             //   arraydateL.add(ldate);
             //   arrayhourL.add(lhour);
              //  arrayminutesL.add(lminutes);

           // }
     //   }
    //    finally {
      //      cursor1.close();
      //  }


         //   for(int j=0;j<arrayID.size();j++){
//                int dyear=Integer.parseInt(arrayyearL.get(0))-Integer.parseInt(arrayyear.get(j));
              //      int dmonth=Integer.parseInt(arraymonthL.get(0))-Integer.parseInt(arraymonth.get(j));
              //     int ddate=Integer.parseInt(arraydateL.get(0))-Integer.parseInt(arraydate.get(j));
               //     int dhour=Integer.parseInt(arrayhourL.get(0))-Integer.parseInt(arrayhour.get(j));
               //    int dminute=Integer.parseInt(arrayminutesL.get(0))-Integer.parseInt(arrayminutes.get(j));

             //   if(dyear==0){
              //            if(dmonth==0){
              //                 if(ddate==0){

                //      if(dhour==0){
                //       if(dminute==0){

               //            db.updateShowTime(arrayID.get(j),"0","minute");
               //        }
                //       else {
                //           if(dminute==1) {


                //               db.updateShowTime(arrayID.get(j),"1","minute");
                //       }
                //       else {
                //          String diffminutes = String.valueOf(dminute);
                 //              db.updateShowTime(arrayID.get(j),diffminutes,"minutes");
                //        }
                 //      }
                 //       }
                 //       else{
                 //        String diffhour = String.valueOf(dhour);

                  //        db.updateShowTime(arrayID.get(j),diffhour,"hours");
                //       }
                //       }
                //       else{
               //         if(ddate==1) {


                //            db.updateShowTime(arrayID.get(j),"1","day");
                 //     }else{
                //        String diffdate = String.valueOf(ddate);

                //            db.updateShowTime(arrayID.get(j),diffdate,"days");
                //        }
                //        } }
                //     else {
                 //      if(dmonth==1){


                 //          db.updateShowTime(arrayID.get(j),"1","month");
                //               }
                  //      else {
                 //       String diffmonth=String.valueOf(dmonth);

                  //         db.updateShowTime(arrayID.get(j),diffmonth,"months");
                  //     }
                  //   }


               //       }
                //     else {
                //      if(dyear==1){


                //          db.updateShowTime(arrayID.get(j),"1","year");
                //      }
                //      else {
                //        String diffyear = String.valueOf(dyear);
               //           db.updateShowTime(arrayID.get(j),diffyear,"years");
              //       }
              //       }

           //     }



     //   Cursor cursorT=db.getShowTimeData(s);
     //   while (cursorT.moveToNext()) {
       //     String t1=cursorT.getString(19);
         //   String t2=cursorT.getString(20);

         //  arrayShowTime1.add(t1);
        //   arrayShowTime2.add(t2);

      //  }


        List<ItemModelPost> itemModelPoList=new ArrayList<>();
        for(int i=0;i<arrayNmae.size();i++)
        {
            ItemModelPost itemModelPo=new ItemModelPost(arrayImageP.get(i),arrayNmae.get(i),arrayQu.get(i),arrayPost.get(i),arrayImagePost.get(i));
            itemModelPoList.add(itemModelPo);

        }

        gridViewPost=(GridView)view.findViewById(R.id.gridP);


        adapterPost= new AdapterPost(itemModelPoList,getActivity());
        gridViewPost.setAdapter(adapterPost);

        return view;
    }

    public class AdapterPost extends BaseAdapter{

        private List<ItemModelPost> itemModelPoList;
        private  List<ItemModelPost> itemPoFilter;
        private Context context;
        LayoutInflater inflater;

        public AdapterPost(List<ItemModelPost> itemModelPoList, Context context) {
            this.itemModelPoList = itemModelPoList;
            this.itemPoFilter=itemModelPoList;
            this.context = context;
            inflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return itemPoFilter.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.post_request_item,null);
            ImageView profilpic=(ImageView)view.findViewById(R.id.pphoto);
            TextView name=(TextView)view.findViewById(R.id.name);
            TextView quotation=(TextView)view.findViewById(R.id.q);
            final TextView postrequest=(TextView)view.findViewById(R.id.post);
            TextView coment=(TextView)view.findViewById(R.id.t);
            final EditText editText=(EditText)view.findViewById(R.id.t2);
            editText.setVisibility(View.GONE);
            final GridView comentgrid=(GridView)view.findViewById(R.id.gridPost);
            comentgrid.setVisibility(View.GONE);
            final CardView c1=(CardView)view.findViewById(R.id.c);
            c1.setVisibility(View.GONE);
            ImageView postImage=(ImageView)view.findViewById(R.id.imgpost);
            final ImageView postsend=(ImageView)view.findViewById(R.id.imgsend);
            postsend.setVisibility(View.GONE);
            TextView T1=(TextView)view.findViewById(R.id.time1);
            TextView T2=(TextView)view.findViewById(R.id.time2);;



            final singleDatabase db=new singleDatabase(getActivity());

            logindialogbox l=new logindialogbox();
            String s=l.s1;





//            profilpic.setImageURI(Uri.parse(itemPoFilter.get(position).getProfilepic()));
            name.setText(itemPoFilter.get(position).getName());
           quotation.setText(itemPoFilter.get(position).getQuotation());
            postrequest.setText(itemPoFilter.get(position).getPostdata());
//            postImage.setImageURI(Uri.parse(itemPoFilter.get(position).getPostimage()));

         //   T1.setText(itemPoFilter.get(position).getpShowTime1());
         //   T2.setText(itemPoFilter.get(position).getpShowTime2());

            final ArrayList<String> arrayPostD=new ArrayList<String>();
            final ArrayList<String> arrayEml=new ArrayList<String>();
            final ArrayList<String> arrayPin=new ArrayList<String>();
            final ArrayList<String> arrayImg=new ArrayList<String>();
            final ArrayList<String> arrayComent=new ArrayList<String>();

            arrayComent.clear();
            arrayEml.clear();
            arrayImg.clear();
            arrayPin.clear();
            arrayPostD.clear();

            coment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    comentgrid.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    c1.setVisibility(View.VISIBLE);
                    postsend.setVisibility(View.VISIBLE);

                    postsend.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Cursor cr=db.getPostData( postrequest.getText().toString());
                           while (cr.moveToNext()){
                               String postdata=cr.getString(9);
                               String emailid=cr.getString(1);
                               String pincode=cr.getString(14);
                                String image=cr.getString(8);
                                arrayEml.add(emailid);
                               arrayImg.add(image);
                                arrayPin.add(pincode);
                                arrayPostD.add(postdata);
                            }
                           String comt=editText.getText().toString();
                            boolean b2=db.insertCommentdata(arrayEml.get(0),arrayPin.get(0),arrayPostD.get(0),comt,arrayImg.get(0));
                            if(b2==true)
                            {
                                Toast.makeText(getContext(),"Data Inserted",Toast.LENGTH_LONG).show();
                            }
                            else
                            { Toast.makeText(getContext(),"Error",Toast.LENGTH_LONG).show();
                            }

                        }
                    });

                    Cursor com=db.getCommentData(postrequest.getText().toString());
                    while (com.moveToNext()){
                        String comentdat=com.getString(4);
                        arrayComent.add(comentdat);

                    }

                    List<ItemModelComment> itemModelCoList=new ArrayList<>();
                    for(int i=0;i<arrayComent.size();i++)
                    {
                        ItemModelComment itemModelCo=new ItemModelComment(arrayComent.get(i));
                        itemModelCoList.add(itemModelCo);

                    }

                    adapterComment= new AdapterComment(itemModelCoList,getActivity());
                    comentgrid.setAdapter(adapterComment);




                }
            });


            return view;
        }
    }
    public  class AdapterComment extends BaseAdapter{

        private List<ItemModelComment> itemModelCoList;
        private  List<ItemModelComment> itemCoFilter;
        private Context context;
        LayoutInflater inflater;

        public AdapterComment(List<ItemModelComment> itemModelCoList, Context context) {
            this.itemModelCoList = itemModelCoList;
            this.itemCoFilter=itemModelCoList;
            this.context = context;
            inflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            return itemCoFilter.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.comment_data,null);
            final TextView comtext=(TextView)view.findViewById(R.id.commenttext);

            comtext.setText(itemCoFilter.get(position).getCommentData());
            return view;
        }
    }
}
