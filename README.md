<h1>connect the application with the datadabe</h1>
<p> test the connection and add to the database with the help of postman;<br> as you can see whenever i add to poatman it directly goes to database </p>
<BR>
<img width="600" alt="postman at the left - database at the right" src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/64d3f355-253e-4571-9287-b0f6fb808507">
<br><br>
<h1>all <b> 4 CRUD operations </b> are implemented in this application </h1>
<p> some examples :<B> post + Delete </B><br><br>After creating and cooding the opreation POST i also create the message of it( Cloud vendor created successfuly )
<br> that can help me fiugre if it successfuly created or not</p>
<BR>
<img width="600" alt="postman" src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/2657d646-0397-4c47-9ddf-ad52d86e1b96"><br><br>
<p>and the same thing with the DELETE opreation ( Cloud vendor Deleted successfuly )</p>
<br>
<img width="600" alt="postman" src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/4f3be7a7-d10b-4a08-b48d-67f2b50469e4">
<br><br>
<p> after using the post opreation in postman, the vendor "c5" was added successfuly in the database</p>
<br>
<img width="600" alt="mysql" src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/c84bfe19-1fd3-41d8-b27c-1c0503ba264e">

<h1> handle exceptions </h1>
<p>cresting a custom message ; handling exceptions that whenever Error comes up give you a clear message that you can understand instead of links and numbers</p>
<br>
<img width="600" alt="handling exception in postman " src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/2508762a-6ce9-49d1-8814-50945e973a31">
<br><br>
<hr><hr>
<h1>Unit testing for the layers</h1>
<p>at first i made a mistake to see if it can show error and it does , so my test is doing the jop</p> i expected false but i wrote true so its error
<br><br>
<img width="933" alt="Screenshot 2024-04-03 173552" src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/b76b8d96-95e4-4ed2-a725-2c1ad9c513a7">

<br>

<h2> 1- repository layer</h2>
<p>it shows the ( TEST PASSED )</p>
<br>
<img width="450" alt="Screenshot 2024-04-03 173408" src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/92ab5fd2-19a8-49b2-81da-46a9ca6a43eb">
<br>
<h2> 2- Sevice layer </h2>
<p> it shows the ( TEST PASSED ) for all 6 functions</p>
<img width="450" alt="Screenshot 2024-04-03 234734" src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/a0c5e603-953d-4834-9e08-afa489cae25d">
<br>
<h2> 3- Controller layer </h2>
<p>first i ask for vendor details to test it if it works good</p>
<br>
<img width="450" alt="Screenshot 2024-04-04 000435" src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/29ccfdff-6aab-4565-8a82-5380dc969ec5">
<br><br>
<p>then i delete the vendor to test if it will delete it </p>
<br>
<img width="450" alt="Screenshot 2024-04-04 000800" src="https://github.com/Alanoudv/Cloud-Vendor-Rest-APi/assets/151371414/39cb73dc-bebd-4bc4-95a6-9b96bd9fe095">










