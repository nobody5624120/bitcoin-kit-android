package io.horizontalsystems.bitcoinkit.core

import io.horizontalsystems.bitcoinkit.models.PublicKey
import io.horizontalsystems.hdwalletkit.HDWallet

class Wallet(private val hdWallet: HDWallet) {

    val gapLimit = hdWallet.gapLimit

    fun publicKey(account: Int, index: Int, external: Boolean): PublicKey {
        val hdPubKey = hdWallet.hdPublicKey(account, index, external)
        return PublicKey(account, index, hdPubKey.external, hdPubKey.publicKey, hdPubKey.publicKeyHash)
    }

}
