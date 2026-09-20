import { Routes, Route } from "react-router-dom"
import Login from "./pages/Login"
import Dashboard from "./pages/Dashboard"
import AddProduct from "./pages/AddProduct"
import AddPayment from "./pages/AddPayment"
import AddInvoice from "./pages/AddInvoice"
import SearchPayment from "./pages/SearchPayment"
import SearchDebt from "./pages/SearchDebt"
import SearchInvoice from "./pages/SearchInvoice"
import GenerateReport from "./pages/GenerateReport"

function App() {
  
  return (
    <Routes>
      <Route index element={<Login />}/>
      <Route path="/dashboard" element={<Dashboard />}/>
      <Route path="/addproduct" element={<AddProduct/>}/>
      <Route path="/addpayment" element={<AddPayment/>}/>
      <Route path="/addinvoice" element={<AddInvoice/>}/>
      <Route path="/searchpayment" element={<SearchPayment/>}/>
      <Route path="/searchdebt" element={<SearchDebt />}/>
      <Route path="/searchinvoice" element={<SearchInvoice />}/>
      <Route path="/generatereport" element={<GenerateReport />}/>
    </Routes>
  )
}

export default App
