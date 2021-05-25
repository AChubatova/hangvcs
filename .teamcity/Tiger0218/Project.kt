package Tiger0218

import Tiger0218.buildTypes.*
import Tiger0218.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0218")
    name = "Tiger0218"

    vcsRoot(Tiger0218_cVCSroot)

    buildType(Tiger0218_Hi0)
    buildType(Tiger0218_Hi1)
    buildType(Tiger0218_Hi2)
    buildType(Tiger0218_Hi3)
})
