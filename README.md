# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Adapter Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما اكون بستخدم module او library و محتاج ال input data بتاعته تكون بشكل مختلف عن شكلها عندي .. او تكون بترجع ال result data بشكل غير اللي انا مستنيه
 .. مثلا المثال الموجود في ال application ده عباره عن two versions من ال painter class و ده بيقوم بطباعة files .. في 
ال version الاولي كان بيطبع ال files وهي بصيغة XML لكن في ال version التانيه حصل تغيير و بقي مستني files من نوع JSON .. الحل هنا اني 
اغير في البرنامج كله اخليه بيستخدم JSON بدل XML و ده حل مكلف جدا و خصوصا لو البرنامج كبير .. الحل اللي ال Design Pattern ده قدمه
هو اننا نعمل Adapter بيستخدم جواه ال painter version two لكنه بيقبل ال files في صيغة XML عادي و هو بيحوله ل JSON و يستخدمه في ال painter version two.
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال package بتاعت ال painters:
    - ال Painter Interface و ده فيه ال methods اللي المفروض تبقي في اي Painter
    - ال PainterV1 Class و ده بيعمل Paint لل files اللي بصيغة XML
    - ال PainterV2 Class و ده بيعمل Paint لل files اللي بصيغة JSON
  - ال package بتاعت ال files:
    - ال XMLFile Class و ده بيعمل بيمثل file بصيغة XML
    - ال JSONFile Class و ده بيعمل بيمثل file بصيغة JSON
  - ال package بتاعت ال adapters:
    - ال PainterAdapter Class و ده ال adapter اللي بياخد ال input بتاعه علي صيغة XML File و بيحوله ل JSON File و بيتعامل بيه مع ال PainterV2
