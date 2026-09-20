import Header from "../components/Header";
import Card from "../components/Card";
import Product from "../assets/Product.svg"
import Invoice from "../assets/Invoice.svg"
import Search from "../assets/Search.svg"
import Debt from "../assets/Debt.svg"
import Euro from "../assets/Euro.svg"
import Report from "../assets/Report.svg"

function Dashboard() {

    return(
        <div>
            <Header />
            <main className="flex flex-row flex-wrap justify-evenly mt-5">
                <Card link="/addproduct" title="Shto Produkt" icon={Product}></Card>
                <Card link="/addpayment" title="Shto Pagesë" icon={Euro}></Card>
                <Card link="/addinvoice" title="Shto Faturë" icon={Invoice}></Card>
                <Card link="/searchdebt" title="Shfleto Borxhin" icon={Debt}></Card>
                <Card link="/searchpayment" title="Shfleto Pagesat" icon={Search}></Card>
                <Card link="/searchinvoice" title="Shfleto Faturat" icon={Search}></Card>
                <Card link="/generatereport" title="Gjenero Raport" icon={Report}></Card>
            </main>
        </div>
    )
}

export default Dashboard;