1. Veri Yapısını Belirle
CSV dosyasındaki her bir satır bir dersi temsil ediyor. Kodunda bu verileri kolayca yönetebilmek için önce bir Course sınıfı oluşturabilirsin.

Bu sınıf; Department, Code, Title ve AKTS alanlarına sahip olmalı.

2. Dosyayı Okuma (Constructor)
CourseInfoTemplate.java içinde boş bırakılan constructor kısmında şunları yapmalısın:

filename parametresini kullanarak dosyayı aç.

Dosyayı satır satır oku ve her satırı virgüllere (,) göre parçala.

Okuduğun bu verileri bir ArrayList içinde sakla.

3. İstenen Metotları Uygula
CourseTest.java dosyasındaki test senaryolarına göre şu mantığı kurmalısın:

getCourses(String dept): Listendeki dersleri dön ve sadece istenen departmana (örneğin "CSE") ait olanların departman adı ile kodunu birleştirerek (örneğin "CSE101T") bir liste olarak döndür.

addCourse(...): Listeye yeni bir ders nesnesi ekle.

removeCourse(dept, code): Listede bu departman ve koda sahip dersi bul ve sil.

changeAKTS(dept, code, newAKTS): Listede ilgili dersi bul ve AKTS değerini güncelle.

changeCourseCode(dept, code, newCode): Listede ilgili dersi bul ve kodunu yenisiyle değiştir.

4. Verileri Dosyaya Kaydetme
Ödev talimatında dosyanın manipüle edilmesi gerektiği belirtiliyor.

Önemli İpucu: Her bir işlemden (ekleme, silme, güncelleme) sonra veya program kapanmadan önce, ArrayList içindeki güncel verileri tekrar aynı isimdeki CSV dosyasına yazmalısın. Böylece CourseInfo.csv dosyan, CourseInfoAfter.csv dosyasındaki gibi güncellenmiş olur.

5. Test Etme
Hazırladığın sınıfın ismini CourseInfo.java olarak belirle (çünkü CourseTest.java bu ismi bekliyor). Programı çalıştırdığında şu çıktıyı almalısın:

CSE101T
CSE101L
CSE204