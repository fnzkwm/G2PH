package com.example.administrator.g2ph;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.cont_3_01, R.drawable.cont_3_02, R.drawable.cont_3_03, R.drawable.cont_3_10, R.drawable.cont_3_05, R.drawable.cont_3_06};
    private  String[] text_title = {"산세베리아", "로즈마리", "베고니아", "선인장", "싱고니움", "고무나무" };
    private  String[] text_sub_title = {"전자파차단, 혈액순환, 물주기(1달) ", "피로회복, 두뇌활발, 물주기(5일)", "안구정화, 수분분출, 물주기(10일)", "공간효율, 물주기(7일)", "실내 습도조절,물주기(7일)", "초미세먼지 제거, 물주기(14일)" };

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.kinds, null); //대상물 가져오기

        ImageView imageView = (ImageView) view.findViewById(R.id.kindsImageView);
        TextView textView1 = (TextView) view.findViewById(R.id.kindsText1);
        TextView textView2 = (TextView) view.findViewById(R.id.kindsText2);

        imageView.setImageResource(images[position]);

        textView1.setText(text_title[position]);
        textView2.setText(text_sub_title[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
