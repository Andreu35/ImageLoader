# ImageLoader

**ImageLoader** is simple and easy to use.

**How to use:**

    private ImageView imageView1, imageView2, imageView3, imageView4;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init ImageLoader
        ImageLoader loader = new ImageLoader(this);

        // Init ImageView's
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);

        // Show your images from URL (http://yourimages  .png/.jpg/.jpeg/ etc...)
        loader.DisplayImage("your_URL", imageView1);
        loader.DisplayImage("your_URL", imageView2);
        loader.DisplayImage("your_URL", imageView3);
        loader.DisplayImage("your_URL", imageView4);
    }
