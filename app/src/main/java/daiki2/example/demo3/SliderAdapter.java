package daiki2.example.demo3;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.io.ObjectOutputStream;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;


    public SliderAdapter(Context context) {

        this.context = context;

    }

    //Arrays
    public int[] slide_images = {
            R.drawable.lv1,
            R.drawable.lv2,
            R.drawable.lv3,
            R.drawable.lv4,
            R.drawable.lv5
    };

    public int[] image1 = {

            R.drawable.look1_shirts,
            R.drawable.look2_jacket,
            R.drawable.look3_sunglass,
            R.drawable.look4_dress,
            R.drawable.look5_tops

    };

    public int[] image2 = {

            R.drawable.look1_skirt,
            R.drawable.look2_skirt,
            R.drawable.look3_dress,
            R.drawable.look4_gobe,
            R.drawable.look5_skirt

    };

    public int[] image3 = {

            R.drawable.look1_globe,
            R.drawable.look2_shoes,
            R.drawable.look3_bag,
            R.drawable.look4_bag,
            R.drawable.look5_globe
    };

    public int[] image4 = {

            R.drawable.look1_bag,
            R.drawable.white,
            R.drawable.look3_shoes,
            R.drawable.look4_shoes,
            R.drawable.look5_bag


    };
    public int[] image5 = {

            R.drawable.look1_shoes,
            R.drawable.white,
            R.drawable.white,
            R.drawable.white,
            R.drawable.look5_shoes


    };

    public String[] number1 = {

            "5",
            "8",
            "2",
            "5",
            "3"

    };
    public String[] number2 = {

            "0",
            "6",
            "5",
            "3",
            "4"
    };
    public String[] number3 = {

            "2",
            "2",
            "5",
            "6",
            "0"
    };
    public String[] number4 = {

            "10",
            "",
            "1",
            "2",
            "2"
    };
    public String[] number5 = {

            "2",
            "",
            "",
            "",
            "6"
    };
    public String[] number6 = {
            "19",
            "16",
            "13",
            "16",
            "15"
    };


    @Override
    public int getCount() {
        return slide_images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_images);
        ImageView slideImageView1 = (ImageView) view.findViewById(R.id.image1);
        ImageView slideImageView2 = (ImageView) view.findViewById(R.id.image2);
        ImageView slideImageView3 = (ImageView) view.findViewById(R.id.image3);
        ImageView slideImageView4 = (ImageView) view.findViewById(R.id.image4);
        ImageView slideImageView5 = (ImageView) view.findViewById(R.id.image5);
        TextView slideHeading1 = (TextView) view.findViewById(R.id.number1);
        TextView slideHeading2 = (TextView) view.findViewById(R.id.number2);
        TextView slideHeading3 = (TextView) view.findViewById(R.id.number3);
        TextView slideHeading4 = (TextView) view.findViewById(R.id.number4);
        TextView slideHeading5 = (TextView) view.findViewById(R.id.number5);
        TextView slideHeading6 = (TextView) view.findViewById(R.id.number6);

        slideImageView.setImageResource(slide_images[position]);
        slideImageView1.setImageResource(image1[position]);
        slideImageView2.setImageResource(image2[position]);
        slideImageView3.setImageResource(image3[position]);
        slideImageView4.setImageResource(image4[position]);
        slideImageView5.setImageResource(image5[position]);
        slideHeading1.setText(number1[position]);
        slideHeading2.setText(number2[position]);
        slideHeading3.setText(number3[position]);
        slideHeading4.setText(number4[position]);
        slideHeading5.setText(number5[position]);
        slideHeading6.setText(number6[position]);


        container.addView(view);

        return view;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }


}
