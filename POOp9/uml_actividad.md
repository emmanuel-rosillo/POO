@startuml
start
:Add games to cart;
:Checkout;
while (if cookie?) is (is invalid)
:Show login form;
end while
fork
:Mail invoice;
fork again
:Load games;
end fork
:Install and play;
end
@enduml