1. Tek Yönlü Bağlı Liste
Tek yönlü bağlı liste, düğümlerin (node) bir sırayla birbirine bağlı olduğu bir veri yapısıdır. Her düğüm, veriyi ve bir sonraki düğümün referansını (işaretçisini) içerir. Başlangıç düğümüne "baş" (head) denir,
son düğüm ise "null" veya "boş" bir işaretçi içerir. Bu yapı, verilerin dinamik olarak eklenmesi ve çıkarılması için uygundur.

3. Tek Yönlü Dairesel Bağlı Liste
Tek yönlü dairesel bağlı liste, düğümlerin birbirine bağlandığı bir yapıdadır; ancak son düğüm, ilk düğümü referans alarak dairesel bir yapı oluşturur. Yani, son düğümün işaretçisi, baş düğümüne işaret eder.
Bu sayede liste üzerinde her zaman dolaşım mümkündür. Başlangıç noktası belirli olmasına rağmen, herhangi bir düğümden başlayarak listeyi dolaşmak mümkündür.

5. Çift Yönlü Dairesel Bağlı Liste
Çift yönlü dairesel bağlı liste, her düğümün hem bir sonraki hem de bir önceki düğümü referans aldığı bir yapıdır. Bu yapı, hem ileri hem de geri yönde dolaşmayı sağlar.Dairesel bağlı listelerin diğer bağlı listelerden farkı
son düğümün sonrası ‘null’ değil de ilk düğümü göstermesidir.Ayrıca, son düğümün işaretçisi baş düğümüne ve baş düğümünün işaretçisi de son düğüme işaret eder,böylece tam bir dairesellik sağlanır.
Bu özellik, elemanların eklenmesi ve silinmesi işlemlerinde esneklik sunar.